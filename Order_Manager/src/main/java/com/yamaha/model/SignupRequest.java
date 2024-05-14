package com.yamaha.model;

import java.math.BigInteger;


public class SignupRequest 
{
	private String username;
	private String fullname;
	private BigInteger phoneNo;
	private String email;
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
	public BigInteger getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	@Override
	public String toString() {
		return "SignupRequest [username=" + username + ", fullname=" + fullname + ", phoneNo=" + phoneNo + ", email="
				+ email + ", password=" + password + ", usercode=" + usercode + "]";
	}
	
	
	public SignupRequest(String username, String fullname, BigInteger phoneNo, String email, String password,
			Integer usercode) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.usercode = usercode;
	}
	
	public SignupRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
