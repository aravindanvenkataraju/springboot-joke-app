package com.aravindan.springframework.joke.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	
	public JokeServiceImpl(@Qualifier("getAnotherChuckNorrisQuotes")ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}



	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
