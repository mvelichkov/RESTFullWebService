package com.web.service;

import java.util.List;

import com.web.entity.User;

public interface UserService {

	List<User> getAllUsers();

	User getUserById(Integer userId);

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(Integer userId);

}
