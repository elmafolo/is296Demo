package com.example.io;

import org.springframework.stereotype.Controller;

@Controller
public class Datasource {
	
	public String username;
	
	public Datasource() {
		System.out.println("Data Source extantianter");
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
