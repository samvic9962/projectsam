package com.surveybank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.surveybank.Service.UserService;
import com.surveybank.entity.User;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public User login(@RequestHeader String email ,
			@RequestHeader String password) {
		
		return userService.login(email, password); 
	}
	
	@PostMapping("/post")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@PutMapping("/update")
	public User update(@RequestHeader String email , @RequestBody User user ) {
		
		return userService.updateDb(email,user);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		userService.delete(email);
		return "data deleted";
	}

}
