package com.consumer.Consumer.ConsumerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consumer.Consumer.model.JobRole;

@Repository
public interface JobRoleRepository extends JpaRepository<JobRole,Integer> {

}
