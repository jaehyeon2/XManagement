package com.example.project.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.controller.BaseController;
import com.example.project.service.CompanyService;
import com.example.project.service.UserService;

@Controller
@RequestMapping("/admin/dashboard")
public class AdminDashboardController extends BaseController{
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value={"/", "", "/index"})
	public String adminDashboard(HttpServletRequest request, HttpServletResponse response, HttpSession session, ModelMap model) throws Exception{
		
		return "admin/dashboard/index";
	}

}
