package com.yamaha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yamaha.entities.CustomerOrder;
import com.yamaha.model.HistoryResponse;
import com.yamaha.model.OrderRequest;
import com.yamaha.model.UpdateRequest;
import com.yamaha.model.UserRequest;
import com.yamaha.repo.OrderRepo;
import com.yamaha.service.OrderService;



@RestController
@CrossOrigin (origins = "*")
public class OrderController 
{
	
	@Autowired
	private OrderService orderservice;
	
	@Autowired
	OrderRepo orderepo;
	
	
	@GetMapping(path ="/testorder")
	public String test()
	{
		System.out.println("Here");
		
		
		return "Welcome To Order Creater";
		
	}	     
	
	@PostMapping("/createorder")
    public String createorder(@RequestBody OrderRequest request) 
	{
        orderservice.insertOrderData(request);
                
        return "Order Successful";
    }
	
	@PostMapping("/orderhistory")
    public List<CustomerOrder> orderhistory(@RequestBody UserRequest request) 
	{
		HistoryResponse response = new HistoryResponse();
		
		
        if(request.getUsercode()==1)
        {
        	response = orderservice.AgentOrderData();
        }
        else
        {
            response = orderservice.CustomerOrderData(request.getUsername());	
        }
        
        
        System.out.println(response.getOrders());
        
        return response.getOrders();
    }
	
	@PostMapping("/updateorder")
    public String updateorder(@RequestBody UpdateRequest request) 
	{
		
		System.out.println(request);
		
	    orderservice.update(request);
	    
	    return "Order Update Successful";
    }
	
	

}
