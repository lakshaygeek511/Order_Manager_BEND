package com.yamaha.model;

public class SigninResponse 
{
	private String username;
	private String fullname;
	private String password;
	private Integer usercode;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUsercode() {
		return usercode;
	}
	public void setUsercode(Integer usercode) {
		this.usercode = usercode;
	}
	
	
	public SigninResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SigninResponse(String username, String fullname, String password, Integer usercode) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		this.usercode = usercode;
	}
	
	
	@Override
	public String toString() {
		return "SigninResponse [username=" + username + ", fullname=" + fullname + ", password=" + password
				+ ", usercode=" + usercode + "]";
	}
	
	
	

}
