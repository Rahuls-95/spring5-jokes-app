package io.soni.services;


import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImp1 implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImp1() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	public String getJoke() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}

}
