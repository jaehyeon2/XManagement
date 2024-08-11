package com.example.project.controller.user;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.project.beans.param.LoginUserParam;
import com.example.project.controller.BaseValidator;


public class LoginUserValidator extends BaseValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object params, Errors errors) {
		if (params instanceof LoginUserParam){
			LoginUserParam loginUserParam = (LoginUserParam)params;
			if(loginUserParam.getUserEmail()==null || loginUserParam.getUserEmail().isEmpty()){
				logger.error("LoginValidator::validate::Error = userEmail is null!");
				errors.rejectValue("userEmail", "userEmail");
			}else{
				String[] userEmailList = loginUserParam.getUserEmail().split("@");
				if (userEmailList.length != 2){
					logger.error("LoginValidator::validate::Error = userEmail form is invalid!");
					errors.rejectValue("userEmail", "userEmail");
				}else{
					loginUserParam.setUserId(userEmailList[0]);
					loginUserParam.setUserDomain(userEmailList[1]);
					logger.info("LoginValidator::validate::info = userId - {}, userDomain - {}", loginUserParam.getUserId(), loginUserParam.getUserDomain());
				}
			}
		}else{
			logger.error("LoginValidator::validate::Error = There is no params");
		}
	}
}
