package com.web.service;
/*package com.web.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.entity.Resource;
import com.web.repositories.ResourcesRepository;

public class ResourceService implements IResourceService{
	
	@Autowired
	private ResourcesRepository resouceRepository;
	
	
	@Override
	public Resource getResourceById(int resourceId) {
		Resource obj = resouceRepository.findById(resourceId).get();
		return obj;
	}	
	@Override
	public List<Resource> getAllResources(){
		List<Resource> list = new ArrayList<Resource>();
		resouceRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	/*
	 * @Override public synchronized boolean addResource(Resource resource){
	 * List<Resource> list =
	 * ResourcesRepository.findByNameAndId(resource.getResourceName(),
	 * resource.getResourceId()); if (list.size() > 0) { return false; } else {
	 * resouceRepository.save(resource); return true; } }
	 
	@Override
	public void updateResource(Resource resource) {
		resouceRepository.save(resource);
	}
	@Override
	public void deleteResource(int resourceId) {
		resouceRepository.delete(getArticleById(resourceId));
	}
	private Resource getArticleById(int resourceId) {
		return null;
	}
	@Override
	public boolean addResource(Resource resource) {
		// TODO Auto-generated method stub
		return false;
	}
} 
*/
