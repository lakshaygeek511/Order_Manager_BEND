package com.yamaha.model;

import java.math.BigInteger;

public class OrderRequest 
{

	private String username;
	private String custname;
	private BigInteger phoneNo;
	private String email;
	private Double latitude;
	private Double longitude;
	private String address;
	private String product;
	private Integer quantity;
	private Integer statuscode;
	private Integer orderdate;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
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
	public Integer getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Integer orderdate) {
		this.orderdate = orderdate;
	}
	
	
	@Override
	public String toString() {
		return "OrderRequest [username=" + username + ", custname=" + custname + ", phoneNo=" + phoneNo + ", email="
				+ email + ", latitude=" + latitude + ", longitude=" + longitude + ", address=" + address + ", product="
				+ product + ", quantity=" + quantity + ", statuscode=" + statuscode + ", orderdate=" + orderdate + "]";
	}
	
	public OrderRequest(String username, String custname, BigInteger phoneNo, String email, Double latitude,
			Double longitude, String address, String product, Integer quantity, Integer statuscode, Integer orderdate) {
		super();
		this.username = username;
		this.custname = custname;
		this.phoneNo = phoneNo;
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.product = product;
		this.quantity = quantity;
		this.statuscode = statuscode;
		this.orderdate = orderdate;
	}
	
	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
