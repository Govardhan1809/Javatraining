package com.consumer.Consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consumer.Consumer.ConsumerRepository.JobRoleRepository;
import com.consumer.Consumer.ConsumerRepository.UserDataRepository;
import com.consumer.Consumer.model.JobRole;
import com.consumer.Consumer.model.UserData;

@Service

public class UserService {

	@Autowired
	
	UserDataRepository userdata;
	
	public UserData addUserData(UserData data) {
		return userdata.save(data);
}}
