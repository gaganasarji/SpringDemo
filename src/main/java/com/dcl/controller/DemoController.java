package com.dcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/demo")
	 public String demo() {
		return "hi welcome to demo";
	}
	@GetMapping("/dcl")
	public String dcl() {
		return "welcome to dcl classes";
	}
}
