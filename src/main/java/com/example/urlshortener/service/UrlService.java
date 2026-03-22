package com.example.urlshortener.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private static final String CHAR_SET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int LENGTH = 6;

    public String generateShortCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < LENGTH; i++) {
            code.append(CHAR_SET.charAt(random.nextInt(CHAR_SET.length())));
        }

        return code.toString();
    }
}