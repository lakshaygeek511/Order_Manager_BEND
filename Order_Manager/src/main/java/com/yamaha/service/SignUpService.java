package com.yamaha.service;

import com.yamaha.model.SigninRequest;
import com.yamaha.model.SigninResponse;
import com.yamaha.model.SignupRequest;

public interface SignUpService 
{
	
	public void insertUserData(SignupRequest userdata);
	
	public SigninResponse getCredType(SigninRequest signindata);
	
}
