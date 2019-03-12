package com.web.service;

import java.util.List;

import com.web.entity.Role;

public interface RoleService {

	List<Role> getAllRoles();

	Role getRoleById(Integer roleId);

	void addRole(Role role);

	void updateRole(Role role);

	void deleteRole(Integer roleId);
}
