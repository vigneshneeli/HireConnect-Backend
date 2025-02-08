package com.example.Backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Model.JobDetails;
import com.example.Backend.Model.LoginDetails;
import com.example.Backend.Service.BackendService;
import com.example.Backend.Service.LoginService;

@RestController
@RequestMapping("/api")
public class BackendController {
	
	@Autowired
	BackendService backendService;
	
	@Autowired
	LoginService loginservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/data")
	public List<JobDetails> findJobs()
	{
		return backendService.findallJobs();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/login")
	public LoginDetails login(@RequestBody LoginDetails logindetails)
	{
		return loginservice.login(logindetails.getUsername(), logindetails.getPassword());
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/sign")
	public String sign(@RequestBody LoginDetails logindetails)
	{
		loginservice.sign(logindetails);
		return "Data Saved Successfully";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/signUp")
	public String signUp(@RequestBody LoginDetails logindetails)
	{
		loginservice.signUp(logindetails);
		return "Data Saved Successfully";
	}
	

}
