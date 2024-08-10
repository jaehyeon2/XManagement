package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.project.beans.LoginUserBean;
import com.example.project.beans.param.LoginUserParam;
import com.example.project.service.LoginUserService;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{
	
	@Autowired
	private String strKey;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private LoginUserService loginUserService;
	
	@GetMapping(value={"/", "", "/index"})
	public String loginIndex(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		logger.info("loginController log");
		
		return "index";
		
	}
	
	@PostMapping(value={"/auth"})
	public String loginAuth(LoginUserParam loginUserParam, HttpServletRequest request, HttpServletResponse response, HttpSession session, RedirectAttributes redirect) throws Exception{
		
		String redirectUrl = "redirect:/dashboard";
		
		LoginUserBean loginUserBean = loginUserService.validateLoginUser(loginUserParam);
		
		switch (loginUserBean.getLoginResultEnum()) {
			case NOTEXIST:
				redirect.addFlashAttribute("userEmail", loginUserParam.getUserEmail());
				redirect.addFlashAttribute("loginErrorMessage", "Account Not Exist");
				redirectUrl = "redirect:/login";
				break;
			case BLOCK:
				redirect.addFlashAttribute("userEmail", loginUserParam.getUserEmail());
				redirect.addFlashAttribute("loginErrorMessage", "Account Block");
				redirectUrl = "redirect:/login";
				break;
			case BLOCK_PWD:
				redirect.addFlashAttribute("userEmail", loginUserParam.getUserEmail());
				redirect.addFlashAttribute("loginErrorMessage", "Account Block Pwd");
				redirectUrl = "redirect:/login";
				break;
			case BLOCK_SLEEP:
				redirect.addFlashAttribute("userEmail", loginUserParam.getUserEmail());
				redirect.addFlashAttribute("loginErrorMessage", "Account Block Sleep");
				redirectUrl = "redirect:/login";
				break;
			case MISMATCH:
				redirect.addFlashAttribute("userEmail", loginUserParam.getUserEmail());
				redirect.addFlashAttribute("loginErrorMessage", "Password Mismatch");
				redirectUrl = "redirect:/login";
				break;
			case ERROR:
				redirect.addFlashAttribute("userEmail", loginUserParam.getUserEmail());
				redirect.addFlashAttribute("loginErrorMessage", "Login Error");
				redirectUrl = "redirect:/login";
				break;
			case SUCCESS:
				session.setAttribute("user", loginUserBean.getUser());
				break;
		}
		
		return redirectUrl;
	}
}
