package com.example.project.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.example.project.beans.model.UserModel;

@Controller
public class BaseController {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	protected UserModel getUser(HttpSession session){
		
		UserModel user = (UserModel)session.getAttribute("user");
		
		return user;
	}
}
