package com.yamaha.service;


import com.yamaha.model.HistoryResponse;

import com.yamaha.model.OrderRequest;
import com.yamaha.model.UpdateRequest;

public interface OrderService 
{
	
	public void insertOrderData(OrderRequest request);
	
	
	public HistoryResponse AgentOrderData();
	
	
	public HistoryResponse CustomerOrderData(String username);


	public void update(UpdateRequest request);

	

}
