package com.example.project.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.beans.ViewModel;
import com.example.project.beans.model.UserModel;
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
		
		List<UserModel> userList = userService.sltUserList(userParam);
		int userCount = userService.sltUserCount(userParam);
		view.setSessionUser(this.getUser(session));
		
		view.setUserList(userList);
		view.setUserCount(userCount);
		view.setPageNum(userParam.getPageNum());
		view.setLimitNum(userParam.getLimitNum());
		
		for (UserModel user:userList){
			logger.info("userParentName = {}", user.getCompanyParentName());
		}
		
		map.put("model", view);
		
		return "admin/user/index";
	}
	
	@GetMapping(value={"/addUser"})
	public String addUserGET(HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap model) throws Exception{
		return "admin/user/addUser";
	}
	
	@PostMapping(value={"/addUser"})
	public String addUserPOST(@Valid UserParam userParam, HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap model) throws Exception{
		
		UserModel sessionUser = this.getUser(request.getSession());
		
		userParam.setAdminId(sessionUser.getUserId());
		
		userService.istUser(userParam);
		return "redirect:/admin/user/index";
	}
	
	@GetMapping(value={"/detail"})
	public String detail(@Valid UserParam userParam, HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap model) throws Exception{
		
		ViewModel view = new ViewModel();
		logger.info("userParam.getUserId = {}", userParam.getUserId());
		logger.info("userParam.getUserDomain = {}", userParam.getUserDomain());
		UserModel user = userService.sltUser(userParam);
		
		view.setUser(user);
		
		model.put("model", view);
		
		return "admin/user/detail";
	}
}