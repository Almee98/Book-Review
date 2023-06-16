package com.example.Book_Review.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontendController {
    @RequestMapping(value = {"/", "/login", "/home", "/other-pages/**"})
    public String forwardToFrontend() {
        return "forward:/index.tsx";
    }
}
