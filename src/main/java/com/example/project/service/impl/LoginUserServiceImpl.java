package com.example.project.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.project.beans.LoginUserBean;
import com.example.project.beans.enums.LoginResultEnum;
import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.LoginUserParam;
import com.example.project.dao.slave.SUserDao;
import com.example.project.service.BasicService;
import com.example.project.service.LoginUserService;

@Service
public class LoginUserServiceImpl extends BasicService implements LoginUserService{
	
	@Override
	public LoginUserBean validateLoginUser(LoginUserParam loginUserParam) throws Exception {
		LoginUserBean loginUserBean = new LoginUserBean();
		
		try{
			Map<String, Object> map = new HashMap<>();
			
			map.put("userEmail", loginUserParam.getUserEmail());
			
			UserModel user = sDbDao.getMapper(SUserDao.class).sltLoginUser(map);
			
			if (user==null){
				loginUserBean.setUser(null);
				loginUserBean.setLoginResultEnum(LoginResultEnum.NOTEXIST);
			}
//			password mismatch - encrypt plan
			else if (!user.getUserPwd().equals(loginUserParam.getUserPwd())){
				loginUserBean.setUser(null);
				loginUserBean.setLoginResultEnum(LoginResultEnum.MISMATCH);
			}
//			account block
			else if (user.getUserStatus().equals(LoginResultEnum.BLOCK.getValue())){
				loginUserBean.setUser(null);
				loginUserBean.setLoginResultEnum(LoginResultEnum.BLOCK);
			}
//			login success
			else{
				loginUserBean.setUser(user);
				loginUserBean.setLoginResultEnum(LoginResultEnum.SUCCESS);
			}
			
		}catch(Exception e){
			logger.error("LoginUserServiceImpl::validateLoginUser::Error = {}", e.getMessage());
			throw e;
		}
		
		return loginUserBean;
	}

}
