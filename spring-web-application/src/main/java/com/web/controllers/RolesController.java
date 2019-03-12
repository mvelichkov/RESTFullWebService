package com.web.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Role;
import com.web.service.RoleService;

@Controller
public class RolesController {
	
	@Autowired
	private RoleService roleService;
	
	@ResponseBody
	@GetMapping(value = "/getAllRoles")
	public List<Role> getAllRoles() {		
		return roleService.getAllRoles();
	}
	
	@ResponseBody
	@GetMapping(value = "/getRoleById/{roleId}")
	public Role getRole(@PathVariable("roleId") Integer roleId) {
		Role role = roleService.getRoleById(roleId);
		return role;
	}

	@ResponseBody
	@PostMapping(value = "/addRole/{roleName}")
	public Role addRole(@PathVariable("roleName") String roleName) {
		Role role = new Role();
		role.setRoleName(roleName);
		role.setDateCreated(new Date());
		role.setDateModified(new Date());
		roleService.addRole(role);
		return role;
	}

	@ResponseBody
	@PutMapping(value = "/updateRole/{roleId}/{roleName}")
	public Role updateRole(@PathVariable("roleId") Integer roleId, @PathVariable("roleName") String roleName) {
		Role role = new Role();
		role.setRoleId(roleId);
		role.setRoleName(roleName);
		roleService.updateRole(role);
		return role;
	}

	@ResponseBody
	@DeleteMapping(value = "/deleteRole/{roleId}")
	public void deleteRole(@PathVariable("roleId") Integer roleId) {
		roleService.deleteRole(roleId);
	}
}
