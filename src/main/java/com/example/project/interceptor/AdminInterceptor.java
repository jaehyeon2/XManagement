package com.example.project.interceptor;

import java.util.Locale;

import javax.naming.AuthenticationException;
import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.example.project.beans.enums.AuthEnum;
import com.example.project.beans.model.UserModel;


public class AdminInterceptor implements HandlerInterceptor{

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	String DEFAULT_TAG = "lang";
	String LANG = "en-US";
	String LANG_SET = "en";

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView modelAndView) throws Exception {

		// Set the language tag for displaying it.
		Locale locale = RequestContextUtils.getLocale(request);
		logger.debug("LanguageTag in postHandle = " + locale.toLanguageTag());

		// Set locale language into Session
		HttpSession session = request.getSession(true);
		session.setAttribute(DEFAULT_TAG, locale.toLanguageTag());
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {

		String pathInfo = request.getPathInfo();
		logger.info("getServletPath >>> " + request.getServletPath());
		logger.info("pathInfo >>> " + pathInfo);

		// True to create new session
		HttpSession session = request.getSession();

		try {
			// Get userInfo from session
			UserModel user = (UserModel) session.getAttribute("user");
			if(user == null) {
				throw new LoginException();
			}else if (!AuthEnum.isAdmin(user.getUserAuth())){
				throw new  AuthenticationException();
			}
		} catch (LoginException | NullPointerException e) {
			session.invalidate();
			logger.warn("LoginException:session is clear.");

			ModelAndView mv = new ModelAndView("redirect:/login");
			ModelAndViewDefiningException mvde = new ModelAndViewDefiningException(mv);
			throw mvde;
		} catch (AuthenticationException e) {
			
			logger.error("AuthenticationExcepetion::user's auth is invalid.");
			ModelAndView mv = new ModelAndView("redirect:/dashboard");
			ModelAndViewDefiningException mvde = new ModelAndViewDefiningException(mv);
			throw mvde;
		}
		return true;
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

}