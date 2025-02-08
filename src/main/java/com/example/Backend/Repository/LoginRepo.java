package com.example.Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Backend.Model.LoginDetails;

@Repository
public interface LoginRepo extends  JpaRepository<LoginDetails,String> {

	LoginDetails findByUsername(String username);
	

}
