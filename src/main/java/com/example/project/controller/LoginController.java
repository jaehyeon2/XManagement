package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.beans.param.LoginUserParam;

@Controller
@RequestMapping("/login")
public class LoginController extends BasicController{
	@GetMapping(value={"/", "", "/index"})
	public String loginIndex(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		logger.info("loginController log");
		
		return "index";
		
	}
	
	@PostMapping(value={"/auth"})
	public String loginAuth(LoginUserParam loginUserParam, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		
		
		return "redirect:/dashboard/index";
	}

}
