package com.example.section4.demo.service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes quotes;

    public JokeServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String makeJoke() {
        return this.quotes.getRandomQuote();
    }
}