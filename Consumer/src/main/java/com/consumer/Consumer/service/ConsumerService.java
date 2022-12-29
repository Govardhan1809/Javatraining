package com.consumer.Consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consumer.Consumer.ConsumerRepository.JobRoleRepository;
import com.consumer.Consumer.ConsumerRepository.UserDataRepository;
import com.consumer.Consumer.model.JobRole;
import com.consumer.Consumer.model.UserData;

@Service

public class ConsumerService {
	
	@Autowired
	JobRoleRepository jobrepo;
	@Autowired
	UserDataRepository userrepo;
	
	public JobRole addJobrole(JobRole role) {
		return jobrepo.save(role);
	}

	public UserData addJobrole(UserData data) {
		return userrepo.save(data);
	}

}
