package com.web.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Role;
import com.web.entity.User;
import com.web.service.RoleService;

@Controller
public class HomeController {

	@ResponseBody
	@GetMapping(value = "/")
	public String home() {
		System.out.println("home()");
		return "home";

	}

	@ResponseBody
	@GetMapping(value = "/edit")
	public String edit() {
		System.out.println("edit()");
		return "edit";
	}
}
