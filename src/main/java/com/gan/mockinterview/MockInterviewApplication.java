package com.gan.mockinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gan.mockinterview.config","com.gan.mockinterview.controller","com.gan.mockinterview.service",
		"com.gan.mockinterview.repository"})
public class MockInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockInterviewApplication.class, args);

	}

}
