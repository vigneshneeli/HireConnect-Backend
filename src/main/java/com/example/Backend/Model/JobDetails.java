package com.example.Backend.Model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobdetails", schema = "jobs") 
public class JobDetails {
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "jobId")
	 int jobId;
	 
	  @Column(name = "companyName")
	 String companyName;
	  @Column(name = "jobName")
		String jobName;
	  
	  @Column(name="payRange")
	  String payRange;
	  
	  @Column(name="jobDescription")
	  String jobDescription;
		
		
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getPayRange() {
		return payRange;
	}
	public void setPayRange(String payRange) {
		this.payRange = payRange;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

}
