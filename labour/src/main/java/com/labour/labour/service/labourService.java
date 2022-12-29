package com.labour.labour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labour.labour.model.labourData;
import com.labour.labour.repository.labourRepository;
@Service
public class labourService {
	
	@Autowired
	labourRepository labourdata;
	
	public labourData addlabourData(labourData data) {
		return labourData.save(data);
}

}
