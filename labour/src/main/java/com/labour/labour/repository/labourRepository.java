package com.labour.labour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labour.labour.model.labourData;



@Repository
public interface labourRepository  extends JpaRepository<labourData,Integer>{
	
}