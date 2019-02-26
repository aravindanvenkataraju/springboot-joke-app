package com.aravindan.springframework.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@SpringBootApplication
@ImportResource("classpath:springboot-joke-app-config.xml")
public class SpringbootJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJokeAppApplication.class, args);
	}
	
}
