package com.example.atoraku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.atoraku.entity.Sweets;
import com.example.atoraku.service.SweetsService;

@Controller
@RequestMapping("/api")
public class SweetsController {

    @Autowired
    private SweetsService sweetsService;

    @GetMapping("/sweets")
    public ResponseEntity<List<Sweets>> getSweets() {
        List<Sweets> sweets = sweetsService.getSweets();
        return ResponseEntity.ok(sweets);
    }
}
