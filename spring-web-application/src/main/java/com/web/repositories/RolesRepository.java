package com.web.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.entity.Role;

public interface RolesRepository extends CrudRepository<Role, Integer> {

	List<Role> findAll();
	
	Role findByRoleId(Integer roleId);
	
	
//    List<Role> findDistinctByCategory(String role_name);
    
    Role save(Role role);

	Role findByRoleIdAndRoleName(Integer roleId, String roleName);

}
