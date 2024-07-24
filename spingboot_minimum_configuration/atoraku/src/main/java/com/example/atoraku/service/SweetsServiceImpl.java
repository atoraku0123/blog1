package com.example.atoraku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.atoraku.entity.Sweets;
import com.example.atoraku.repository.SweetsRepository;

@Service
public class SweetsServiceImpl implements SweetsService {

    @Autowired
    private SweetsRepository sweetsRepository;

    public List<Sweets> getSweets() {
        return sweetsRepository.findAll();
    }
}
