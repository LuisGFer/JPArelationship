package com.example.relationships.model;

import lombok.Data;


import javax.persistence.*;


@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column
    private byte[] image;

    public Category() {
    }

    public Category(Long id, String name, byte[] image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }
}
