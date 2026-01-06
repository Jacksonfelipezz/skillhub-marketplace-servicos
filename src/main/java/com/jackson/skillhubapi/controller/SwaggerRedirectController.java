package com.jackson.skillhubapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirectController {

    @GetMapping("/")
    public String redirectToSwagger() {
        // Corrected the spelling to 'swagger-ui'
        return "redirect:/swagger-ui/index.html";
    }
}