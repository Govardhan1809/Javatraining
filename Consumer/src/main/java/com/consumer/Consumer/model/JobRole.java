package com.consumer.Consumer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class JobRole {
	
	@Id
	@GeneratedValue
	private int jobid;
	
	@NotNull
	@Size(min=2,message="Name should be more than 2")
	private String jobname;

	public JobRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobRole(int jobid, String jobname) {
		super();
		this.jobid = jobid;
		this.jobname = jobname;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	

}

