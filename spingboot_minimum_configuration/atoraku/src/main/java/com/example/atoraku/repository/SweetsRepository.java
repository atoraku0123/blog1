package com.example.atoraku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.atoraku.entity.Sweets;

@Repository
public interface SweetsRepository extends JpaRepository<Sweets, Integer> {

}
