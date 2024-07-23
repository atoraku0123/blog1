package com.example.atoraku.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SweetsController {

    @GetMapping("/sweets")
    public ResponseEntity<String> getSweets() {
        return ResponseEntity.ok("test\n");
    }

}
