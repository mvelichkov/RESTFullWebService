package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
	
	@GetMapping(value = "/isDBConnected")
	public boolean isDBConnected() {
		return false;
	}
	

}
