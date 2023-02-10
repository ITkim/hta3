package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("t")
	public String m1() {
		System.out.println("==================");
		return "test";
	}
	
}
