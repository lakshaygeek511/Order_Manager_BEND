
package com.yamaha.entities;

import java.io.Serializable;
import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="customer_order_mapping", schema="public" )
public class CustomerOrder implements Serializable 
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="orderno")
    private Integer    orderno ;
    
    @Column(name="username", nullable=false, length=2147483647)
    private String     username ;

    
    @Column(name="custname", nullable=false, length=2147483647)
    private String     custname ;
    
  
    @Column(name="phoneNo")
    private BigInteger    phoneno ;

    //--- ENTITY DATA FIELDS 
    @Column(name="email", nullable=false, length=2147483647)
    private String     email ;

    @Column(name="latitude")
    private Double    latitude ;

    @Column(name="longitude")
    private Double    longitude ;
    
    
    @Column(name="address" , nullable=false, length=2147483647)
    private String    address ;
    
    @Column(name="product" , nullable=false, length=2147483647)
    private String    product ;
    
    @Column(name="quantity" ,nullable=false, length=2147483647)
    private Integer    quantity ;
    
    @Column(name="statuscode" ,nullable=false)
    private Integer    statuscode ;

    @Column(name="orderdate" ,nullable=false)
    private Integer    orderdate ;

    
    
	public Integer getOrderno() {
		return orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

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

	public BigInteger getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(BigInteger phoneno) {
		this.phoneno = phoneno;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CustomerOrder [orderno=" + orderno + ", username=" + username + ", custname=" + custname + ", phoneno="
				+ phoneno + ", email=" + email + ", latitude=" + latitude + ", longitude=" + longitude + ", address="
				+ address + ", product=" + product + ", quantity=" + quantity + ", statuscode=" + statuscode
				+ ", orderdate=" + orderdate + "]";
	}

	public CustomerOrder(Integer orderno, String username, String custname, BigInteger phoneno, String email,
			Double latitude, Double longitude, String address, String product, Integer quantity, Integer statuscode,
			Integer orderdate) {
		super();
		this.orderno = orderno;
		this.username = username;
		this.custname = custname;
		this.phoneno = phoneno;
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.product = product;
		this.quantity = quantity;
		this.statuscode = statuscode;
		this.orderdate = orderdate;
	}

	public CustomerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

    
	
	
}
