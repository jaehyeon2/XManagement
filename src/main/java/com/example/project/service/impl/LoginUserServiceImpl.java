package com.example.project.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.project.beans.LoginUserBean;
import com.example.project.beans.enums.LoginResultEnum;
import com.example.project.beans.model.UserModel;
import com.example.project.beans.param.LoginUserParam;
import com.example.project.dao.master.MUserDao;
import com.example.project.dao.slave.SUserDao;
import com.example.project.service.BaseService;
import com.example.project.service.LoginUserService;

@Service
public class LoginUserServiceImpl extends BaseService implements LoginUserService{
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
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
//			account block
			else if (user.getUserStatus().equals(LoginResultEnum.BLOCK.getValue())){
				loginUserBean.setUser(null);
				loginUserBean.setLoginResultEnum(LoginResultEnum.BLOCK);
			}
//			account pwd block
			else if (user.getUserStatus().equals(LoginResultEnum.BLOCK_PWD.getValue())){
				loginUserBean.setUser(null);
				loginUserBean.setLoginResultEnum(LoginResultEnum.BLOCK_PWD);
			}
			else if (user.getUserStatus().equals(LoginResultEnum.BLOCK_SLEEP.getValue())){
				loginUserBean.setUser(null);
				loginUserBean.setLoginResultEnum(LoginResultEnum.BLOCK_SLEEP);
			}
//			password mismatch - encrypt plan
			else if (!passwordEncoder.matches(loginUserParam.getUserPwd(), user.getUserPwd())){
				loginUserBean.setUser(null);
				loginUserBean.setLoginResultEnum(LoginResultEnum.MISMATCH);
				loginUserParam.setUserPwdMiscount(user.getUserPwdMismatch()+1);
				this.udtUserPwdMismatch(loginUserParam);
			}
//			login success
			else{
				loginUserBean.setUser(user);
				loginUserBean.setLoginResultEnum(LoginResultEnum.SUCCESS);
				loginUserParam.setUserPwdMiscount(0);
				this.udtUserPwdMismatch(loginUserParam);
			}
			
		}catch(Exception e){
			logger.error("LoginUserServiceImpl::validateLoginUser::Error = {}", e.getMessage());
			loginUserBean.setUser(null);
			loginUserBean.setLoginResultEnum(LoginResultEnum.ERROR);
		}
		
		return loginUserBean;
	}
	
	@Override
	public boolean udtUserPwdMismatch(LoginUserParam loginUserParam) throws Exception{
		
		int intResult = 0;
		
		try{
			Map<String, Object> map = new HashMap<>();
			
			map.put("userId", loginUserParam.getUserId());
			map.put("userDomain", loginUserParam.getUserDomain());
			map.put("userPwdMismatch", loginUserParam.getUserPwdMiscount());
			
			intResult = mDbDao.getMapper(MUserDao.class).udtUser(map);
			
			if (intResult<1){
				logger.error("LoginUserServiceImpl::udtUserPwdMismatch::Error = update pwd_mismatch is fail, userId = {}", loginUserParam.getUserId());
				return false;
			}
		}catch(Exception e){
			logger.error("LoginUserServiceImpl::udtUserPwdMismatch::Error = {}", e.getMessage());
			throw e;
		}
		
		return true;
		
	}

}
