package com.aravindan.springframework.joke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class SpringBootJokeAppConfiguration {
	
	@Bean
	@Primary
	public ChuckNorrisQuotes getChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
	
	@Bean
	public ChuckNorrisQuotes getAnotherChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
