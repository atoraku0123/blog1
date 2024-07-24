package com.example.atoraku.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SWEETS")
public class Sweets {

    @Id
    private Integer id;

    private String sweetsName;

    private Integer price;
}
