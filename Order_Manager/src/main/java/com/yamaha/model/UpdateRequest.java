package com.yamaha.model;

import java.math.BigInteger;

public class UpdateRequest 
{
	private Integer orderno;
	private String custname;
	private BigInteger phoneNo;
	private String email;
	private String address;
	private String product;
	private Integer quantity;
	private Integer statuscode;
	
	
	
	public Integer getOrderno() {
		return orderno;
	}
	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(Integer statuscode) {
		this.statuscode = statuscode;
	}
	
	
	@Override
	public String toString() 
	{
		return "UpdateRequest [orderno=" + orderno + ", custname=" + custname + ", phoneNo=" + phoneNo + ", email="
				+ email + ", address=" + address + ", product=" + product + ", quantity=" + quantity + ", statuscode="
				+ statuscode + "]";
	}
	
	
	public UpdateRequest(Integer orderno, String custname, BigInteger phoneNo, String email, String address,
			String product, Integer quantity, Integer statuscode) 
	{
		super();
		this.orderno = orderno;
		this.custname = custname;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.product = product;
		this.quantity = quantity;
		this.statuscode = statuscode;
	}
	
	
	public UpdateRequest() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
}
