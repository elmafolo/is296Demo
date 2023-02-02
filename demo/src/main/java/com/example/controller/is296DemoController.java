package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.io.Datasource;

@Controller
public class is296DemoController {
	
	
	Datasource ds;
	public is296DemoController(Datasource ds) {
		
		System.out.println("Controller Instatiater");
		this.ds = ds;
		
	}
	
	@GetMapping("homebase")
	public String getHomePage() {
		return "home";
	}
	
		
	

}
