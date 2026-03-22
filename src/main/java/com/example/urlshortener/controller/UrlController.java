package com.example.urlshortener.controller;

import com.example.urlshortener.model.Url;
import com.example.urlshortener.repository.UrlRepository;
import com.example.urlshortener.service.UrlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "*")
public class UrlController {

    @Autowired
    private UrlRepository repository;

    @Autowired
    private UrlService service;

    // POST /shorten
    @PostMapping("/shorten")
    public Url shortenUrl(@RequestBody Url request) {
        String code = service.generateShortCode();

        Url url = new Url();
        url.setOriginalUrl(request.getOriginalUrl());
        url.setShortCode(code);

        return repository.save(url);
    }

    // GET /{shortCode}
    @GetMapping("/{shortCode}")
    public void redirect(@PathVariable String shortCode, HttpServletResponse response) throws Exception {
        Optional<Url> url = repository.findByShortCode(shortCode);

        if (url.isPresent()) {
            response.sendRedirect(url.get().getOriginalUrl());
        } else {
            response.sendError(404, "URL not found");
        }
    }
}