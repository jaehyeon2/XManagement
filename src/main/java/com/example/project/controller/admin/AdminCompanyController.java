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

import com.example.project.beans.model.CompanyModel;
import com.example.project.beans.model.UserModel;
import com.example.project.beans.model.ViewModel;
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
	public String index(@Valid CompanyParam companyParam, HttpServletRequest request, HttpServletResponse response, ModelMap model, ViewModel view) throws Exception {
		
		List<CompanyModel> companyList = companyService.sltCompanyList(companyParam); 
		
		view.setCompanyList(companyList);
		
		model.put("model", view);
		
		return "admin/company/index";
	}
	
	@GetMapping(value={"/addCompany"})
	public String addCompanyGET(@Valid CompanyParam companyParam, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		
		ViewModel view = new ViewModel();
		
		List<CompanyModel> companyList = companyService.sltCompanyList(companyParam);
		
		view.setCompanyList(companyList);
		
		model.put("model", view);
		
		return "admin/company/addCompany";
	}
	
	@PostMapping(value={"/addCompany"})
	public String addCompany(@Valid CompanyParam companyParam, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception{
		
		//TODO
		UserModel sessionUser = this.getUser(session);
		companyParam.setAdminId(sessionUser.getUserId());
		
		companyService.istCompany(companyParam);
		
		return "redirect:/admin/company";
	}

}
