package com.production.perfectProduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.production.perfectProduction.dao.AdminDao;
import com.production.perfectProduction.dto.LoginDto;
@Service
public class LoginServiceImpl implements LoginService{

	
	@Autowired
	AdminDao admindao;
	
	@Override
	public boolean authorise(LoginDto logindto) {
		return admindao.authorize(logindto.getEmail(), logindto.getPassword());
	}

}
