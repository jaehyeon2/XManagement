package com.example.project.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.controller.BaseController;

@Controller
@RequestMapping("/admin")
public class AdminIndexController extends BaseController{

	@GetMapping(value={"/", "", "/index"})
	public String index(){
		return "admin/index";
	}
}
