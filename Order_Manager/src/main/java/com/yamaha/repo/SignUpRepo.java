package com.yamaha.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yamaha.entities.UserMaster;


public interface SignUpRepo extends JpaRepository<UserMaster, String>
{
	
	public UserMaster findByUsername(String username);
	
}
