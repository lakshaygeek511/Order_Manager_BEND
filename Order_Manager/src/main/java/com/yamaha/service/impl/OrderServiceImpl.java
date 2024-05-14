package com.yamaha.service.impl;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yamaha.entities.CustomerOrder;
import com.yamaha.model.HistoryResponse;
import com.yamaha.model.OrderRequest;
import com.yamaha.model.UpdateRequest;
import com.yamaha.repo.OrderRepo;
import com.yamaha.service.OrderService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService
{
	
	@Autowired
	OrderRepo orderepo;
	
	@Override
	public void insertOrderData(OrderRequest request)
	{
		// TODO Auto-generated method stub
		
		CustomerOrder order = new CustomerOrder ();
		
		order.setUsername(request.getUsername());
		order.setCustname(request.getCustname());
		order.setPhoneno(request.getPhoneNo());
		order.setEmail(request.getEmail());
		order.setLatitude(request.getLatitude());
		order.setLongitude(request.getLongitude());
		order.setAddress(request.getAddress());
		order.setProduct(request.getProduct());
		order.setQuantity(request.getQuantity());
		order.setStatuscode(request.getStatuscode());
		order.setOrderdate(request.getOrderdate());
		   
		orderepo.saveAndFlush(order);
	}

	@Override
	public HistoryResponse AgentOrderData() 
	{
		HistoryResponse history = new HistoryResponse();
		
		history.setOrders(orderepo.findAll());
		
		return history;
	}

	@Override
	public HistoryResponse CustomerOrderData(String username) 
	{
		HistoryResponse history = new HistoryResponse();
		
		history.setOrders(orderepo.findByUsername(username));
		
		return history;
	}

	@Override
	public void update(UpdateRequest request) 
	{
		// TODO Auto-generated method stub
		Integer orderno = request.getOrderno();
        String custname = request.getCustname();
        BigInteger phoneNo = request.getPhoneNo();
        String email = request.getEmail();
        String address = request.getAddress();
        String product = request.getProduct();
        Integer quantity = request.getQuantity();
        Integer statuscode = request.getStatuscode();

        orderepo.updateOrder(orderno, custname, phoneNo, email, address, product, quantity, statuscode);
	}

	


	
}
