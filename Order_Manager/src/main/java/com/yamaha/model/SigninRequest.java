package com.yamaha.model;

public class SigninRequest 
{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public SigninRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public SigninRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SigninRequest [username=" + username + ", password=" + password + "]";
	}

}
