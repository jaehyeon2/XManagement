package com.example.project.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.beans.model.ViewModel;
import com.example.project.beans.param.UserParam;
import com.example.project.controller.BaseController;
import com.example.project.service.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin/user")
public class AdminUserController extends BaseController{

	@Autowired
	private UserService userService;
	
	@GetMapping(value={"/", "", "/index"})
	public String index(@Valid UserParam userParam, HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap map) throws Exception{
		
		ViewModel view = new ViewModel();
		
		view.setSessionUser(this.getUser(session));
		
		view.setUserList(userService.sltUserList(userParam));
		view.setUserCount(userService.sltUserCount(userParam));
		view.setPageNum(userParam.getPageNum());
		view.setLimitNum(userParam.getLimitNum());
		
		map.put("model", view);
		
		return "admin/user/index";
	}
	
	@GetMapping(value={"/addUser"})
	public String addUserGET(HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap model) throws Exception{
		return "admin/user/addUser";
	}
	
	@PostMapping(value={"/addUser"})
	public String addUserPOST(@Valid UserParam userParam, HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap model) throws Exception{
		userService.istUser(userParam);
		return "redirect:/admin/user/index";
	}
}