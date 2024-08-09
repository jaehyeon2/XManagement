package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.beans.model.UserModel;
import com.example.project.beans.model.ViewModel;

@Controller
@RequestMapping("/dashboard")
public class DashboardController extends BaseController{
	
	@GetMapping(value={"/", "", "/index"})
	public String indexDashboard(HttpServletRequest request, HttpServletResponse response, HttpSession session, ViewModel viewModel, ModelMap map) throws Exception{
		UserModel user = this.getUser(session);
		
		viewModel.setUser(user);
		
		map.addAttribute("model", viewModel);
		
		return "/dashboard/index";
	}

}
