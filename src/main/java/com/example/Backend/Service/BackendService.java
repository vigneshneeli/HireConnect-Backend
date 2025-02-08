package com.example.Backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.Model.JobDetails;
import com.example.Backend.Repository.BackendRepo;

@Service
public class BackendService {

	
	@Autowired
	BackendRepo backendRepo;
	
	
	public List<JobDetails> findallJobs()
	{
		return backendRepo.findAll();
	}
}
