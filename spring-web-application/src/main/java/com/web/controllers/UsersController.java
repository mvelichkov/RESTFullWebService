package com.web.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Role;
import com.web.entity.User;
import com.web.repositories.RolesRepository;
import com.web.service.UserService;

@RestController
public class UsersController {
	
	@Autowired
	private RolesRepository rolesRepository;
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@PostMapping(value = "/addUser/{email}/{userUniqueId}/{roleId}/{firstName}/{lastName}")
	public User addUser(@PathVariable("email") String email, @PathVariable("userUniqueId") String userUniqueId,
			@PathVariable("roleId") Integer roleId, @PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {

		User user = new User();
		user.setEmail(email);
		user.setUserUniqueId(userUniqueId);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setDateCreated(new Date());
		user.setDateModified(new Date());
		
		Role role = rolesRepository.findByRoleId(roleId);
		
		user.setRole(role);
		
		userService.addUser(user);
		
		return user;
	}
}
