package com.example.project.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.CompanyParam;
import com.example.project.controller.BaseController;
import com.example.project.service.CompanyService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin/company")
public class AdminCompanyController extends BaseController{
	
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping(value={"/", "", "/index"})
	public String index(){
		return "admin/company/index";
	}
	
	@PostMapping(value={"/addCompany"})
	public @ResponseBody boolean addCompany(@Valid CompanyParam companyParam, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception{
		
		//TODO
		
		boolean result = companyService.istCompany(companyParam);
		
		
		return false;
	}

}
