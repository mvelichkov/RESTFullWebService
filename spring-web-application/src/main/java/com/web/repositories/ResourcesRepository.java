package com.web.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.entity.Resource;

public interface ResourcesRepository extends CrudRepository<Resource, Integer> {
	/*
	 * static List<Resource> findByNameAndId(String resourceName, Integer
	 * resourceId) { return null; }
   */	 

}
