package com.example.Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Backend.Model.JobDetails;


@Repository
public interface BackendRepo extends JpaRepository<JobDetails,Integer>{
	
}
