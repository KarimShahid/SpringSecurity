package com.example.demo.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	
	//localhost:8080/home/users
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("Getting User");
		return userService.getUsers();
	}
	
	
	@GetMapping("/current-user")
//	to show current user logged in
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
}
