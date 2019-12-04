package com.matiar.api.explore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {
	@RequestMapping("/")
	public String restHome() {
		return "Das boot, reporting for duty!";
	}
}
