package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.models.User;

@Service
public class UserService {
	 private List<User> store = new ArrayList<>();

	 
	public UserService() {
	
		store.add(new User(UUID.randomUUID().toString(), "Harish KC","harish@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Sugam KC","sugg@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Pam Pal","pam@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Anikit Shukla","ankit@gmail.com"));
	}
	 
	
	public List<User> getUsers(){
		return store;
	}
	 
}
