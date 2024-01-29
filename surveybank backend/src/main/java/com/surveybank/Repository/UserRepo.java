package com.surveybank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.surveybank.entity.User;

@Repository
public interface UserRepo  extends JpaRepository<User, Integer> {

	@Query(value =  "select * from User where email =?" , nativeQuery = true)
    User findByEmail(String email);

}
