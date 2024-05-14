package com.yamaha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yamaha.model.SigninRequest;
import com.yamaha.model.SigninResponse;
import com.yamaha.model.SignupRequest;
import com.yamaha.service.SignUpService;

@RestController
@CrossOrigin (origins = "*")
public class SignUpController
{
	@Autowired
	private SignUpService signupservice;
	
	
	@GetMapping(path ="/test")
	public String test()
	{
		System.out.println("Here");
		
		
		return "Welcome To Order Manager";
		
	}	     
	
	@PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) 
	{
        signupservice.insertUserData(request);
        
        return "Signup successful";
    }
	
	
	
	@PostMapping("/signin")
	public SigninResponse signin(@RequestBody SigninRequest request)
	{
		
		return signupservice.getCredType(request);
	}
	
}
