package com.yamaha.model;

import java.util.List;

import com.yamaha.entities.CustomerOrder;

public class HistoryResponse 
{
	List<CustomerOrder> orders;

	public List<CustomerOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<CustomerOrder> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "HistoryResponse [orders=" + orders + "]";
	}

	public HistoryResponse(List<CustomerOrder> orders) {
		super();
		this.orders = orders;
	}

	public HistoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
