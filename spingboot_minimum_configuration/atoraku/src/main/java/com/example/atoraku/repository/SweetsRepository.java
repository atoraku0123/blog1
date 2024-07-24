package com.example.atoraku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atoraku.entity.Sweets;

public interface SweetsRepository extends JpaRepository<Sweets, Integer> {

}
