package com.samreen.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class DemoController {

	@GetMapping
	public String getName() {
		
		return "Welcome to deployment in docker";
	}
}
