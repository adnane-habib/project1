package com.userupdate.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.userupdate.project1.controllers;",
		"com.userupdate.project1.service;",
		"com.userupdate.project1.dao;",
		"com.userupdate.project1.entity;"})
@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

}
