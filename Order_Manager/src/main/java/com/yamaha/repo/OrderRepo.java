package com.yamaha.repo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yamaha.entities.CustomerOrder;


public interface OrderRepo extends JpaRepository<CustomerOrder, Integer>
{

	public List<CustomerOrder> findByUsername(String username);
	
	@Modifying
	@Query("UPDATE CustomerOrder co SET co.custname = :custname, co.phoneno = :phoneNo, co.email = :email, " +
	        "co.address = :address, co.product = :product, co.quantity = :quantity, co.statuscode = :statuscode " +
	        "WHERE co.orderno = :orderno")
	void updateOrder(@Param("orderno") Integer orderno, @Param("custname") String custname,
	                 @Param("phoneNo") BigInteger phoneNo, @Param("email") String email,
	                 @Param("address") String address, @Param("product") String product,
	                 @Param("quantity") Integer quantity, @Param("statuscode") Integer statuscode);

	
}
