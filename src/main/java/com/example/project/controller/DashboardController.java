package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController extends BaseController{
	
	@GetMapping(value={"/", "", "/index"})
	public String indexDashboard() throws Exception{
		
		return "";
	}

}
