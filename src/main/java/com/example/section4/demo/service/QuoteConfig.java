package com.example.section4.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class QuoteConfig {

    @Bean
    public ChuckNorrisQuotes quotes() {
        return new ChuckNorrisQuotes();
    }

}