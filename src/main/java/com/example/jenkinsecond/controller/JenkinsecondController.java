package com.example.jenkinsecond.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsecondController {

	@GetMapping(value="/admin")
	public String getData() {
		return "msg";
	}

}
