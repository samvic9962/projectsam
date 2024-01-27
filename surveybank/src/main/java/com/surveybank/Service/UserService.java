package com.surveybank.Service;

import com.surveybank.entity.User;

public interface UserService {
	User login(String email, String password );


	User addUser(User user);

	User updateDb(String email,User user);

	void delete(String email);
	

}
