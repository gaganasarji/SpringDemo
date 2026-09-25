package com.dcl.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class DemoService {
	@GetMapping("/student")
	public String demoService() {
		return "the service is provided";
	}
}
