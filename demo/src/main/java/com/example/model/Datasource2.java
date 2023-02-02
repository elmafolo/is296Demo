package com.example.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.controller.is296DemoController;

@Controller
public class Datasource2 {
	

	private is296DemoController is296;
	
	public Datasource2(is296DemoController is296) {
		System.out.println("Datasource 2 instantiater");
		this.is296 = is296;
		
	}

}
