package com.web.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Role;
import com.web.repositories.RolesRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RolesRepository roleRepository;

	@Override
	public List<Role> getAllRoles() {
		List<Role> list = roleRepository.findAll();
		System.out.println(Arrays.toString(list.toArray()));
		return list;
	}

	@Override
	public Role getRoleById(Integer roleId) {
		Role obj = roleRepository.findByRoleId(roleId);
		return obj;
	}

	@Override
	public void addRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public void updateRole(Role role) {
		Role updatedRole = roleRepository.findByRoleId(role.getRoleId());
		updatedRole.setRoleName(role.getRoleName());
		updatedRole.setDateModified(new Date());

		roleRepository.save(updatedRole);

	}

	@Override
	public void deleteRole(Integer roleId) {
		roleRepository.deleteById(roleId);

	}
}
