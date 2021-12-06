package com.example.section4.demo;


import com.example.section4.demo.services.JokeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);

		// Cast concrete bean to interface
		var service = (JokeService) ctx.getBean("jokeServiceImpl");
		System.out.println(service.makeJoke());
	}

}
