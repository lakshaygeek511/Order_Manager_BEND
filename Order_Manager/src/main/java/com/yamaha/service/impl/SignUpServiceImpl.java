package com.yamaha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yamaha.entities.UserMaster;
import com.yamaha.model.SigninRequest;
import com.yamaha.model.SigninResponse;
import com.yamaha.model.SignupRequest;
import com.yamaha.repo.SignUpRepo;
import com.yamaha.service.SignUpService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SignUpServiceImpl implements SignUpService
{
	@Autowired
	SignUpRepo signuprepo;
	
	@Override
	public void insertUserData(SignupRequest userdata)
	{
	   UserMaster user = new UserMaster ();
	   
	   
	   user.setUsername(userdata.getUsername());
	   user.setFullname(userdata.getFullname());
	   user.setPhoneno(userdata.getPhoneNo());
	   user.setEmail(userdata.getEmail());
	   user.setPassword(userdata.getPassword());
	   user.setUsercode(userdata.getUsercode());
	   
	   signuprepo.saveAndFlush(user);
	   
	}

	@Override
	public SigninResponse getCredType(SigninRequest signindata) 
	{
		
		SigninResponse deliver = new SigninResponse();

	
		UserMaster data = signuprepo.findByUsername(signindata.getUsername());
		
		deliver.setUsername(data.getUsername());
		deliver.setFullname(data.getFullname());
		deliver.setPassword(data.getPassword());
		deliver.setUsercode(data.getUsercode());

		
		return deliver;
	}


	
}
