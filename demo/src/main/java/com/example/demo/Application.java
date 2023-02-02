package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import config.AppConfig;


public class Application {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class);
		System.out.println("YES IT s running");
		
		//Checking if everything is in place
	}

}
