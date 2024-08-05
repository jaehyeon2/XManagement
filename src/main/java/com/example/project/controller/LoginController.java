package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginController {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value={"/", "", "/index"})
	public String loginIndex(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		return "login/index";
		
	}
	
	@PostMapping(value={"/auth"})
	public String loginAuth() throws Exception{
		
		return "redirect:/dashboard/index";
	}

}
