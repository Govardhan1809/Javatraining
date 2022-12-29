package com.consumer.Consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.Consumer.model.JobRole;
import com.consumer.Consumer.model.UserData;
import com.consumer.Consumer.service.ConsumerService;

@RestController
@RequestMapping("api/consumer")
public class ConsumerController {
	
	@Autowired
	ConsumerService service;
	
	@PostMapping("/jobrole")
	public JobRole addJobRole(@RequestBody JobRole role) {
		return role;
	}
	@PostMapping("/userdata")

	public UserData addUserData(@RequestBody UserData data) {
	return service.addJobrole(data);

}}
