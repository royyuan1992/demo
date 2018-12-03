package com.example.demo;

import javax.websocket.server.PathParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/hello/{name}")
	public String hello2(@PathVariable(value="name") String name) {
		return "hello "+ name;
	}
	
	private void doNothing() {
		System.out.println("...");
	}
}
