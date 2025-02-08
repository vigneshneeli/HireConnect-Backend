package com.example.Backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Model.LoginDetails;
import com.example.Backend.Repository.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo loginRepo;
	
	public LoginDetails sign(LoginDetails logindetails)
	{
		return loginRepo.save(logindetails);
	}
 
	public LoginDetails signUp(LoginDetails logindetails) {
		return loginRepo.save(logindetails);
	}
	
	public LoginDetails login(String username,String password) {
		LoginDetails logindetails=loginRepo.findByUsername(username);
		if(logindetails!=null && password.equals(logindetails.getPassword())) {
			return logindetails;
		}
		return null;
	}
}
