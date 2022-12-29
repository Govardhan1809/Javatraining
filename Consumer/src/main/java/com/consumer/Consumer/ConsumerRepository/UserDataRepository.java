package com.consumer.Consumer.ConsumerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consumer.Consumer.model.JobRole;
import com.consumer.Consumer.model.UserData;
@Repository
public interface UserDataRepository  extends JpaRepository<UserData,Integer> {

}
