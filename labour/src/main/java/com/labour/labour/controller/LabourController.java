package com.labour.labour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.labour.labour.model.labourData;
import com.labour.labour.service.labourService;
@RestController
@RequestMapping("api/labour")
public class LabourController {

	
		
		@Autowired
		labourService service;
		
		
		@PostMapping("/labourdata")

		public labourData addUserData(@RequestBody labourData data) {
		return service.addlabourData(data);

	}}



