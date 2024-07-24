package com.example.atoraku.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.atoraku.entity.Sweets;

public interface SweetsService {

    public List<Sweets> getSweets();
}
