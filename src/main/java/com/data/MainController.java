
package com.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class MainController {


	@Autowired
	private UserDao data;
	
	@GetMapping("/users")
	public List<User> retriveAllUsers()
	{
		return data.findAll();
	}
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id) 
	{
		return data.findOne(id);
	}
    
  
}
