package com.example.atoraku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SweetsController {

    @GetMapping("/")
    public String getSweets() {
        return "test";
    }

}
