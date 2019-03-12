package com.web.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.web.entity.User;

public interface UsersRepository extends CrudRepository<User, Integer> {

	static List<User> findByUserIdAndFirstName(Integer userId, String firstName) {

		return null;
	}

	/*
	 * static List<User> findByIdAndName(Integer userId, String firstName) { return
	 * null; }
	 * 
	 * public User findByName(String name);
	 */
}
