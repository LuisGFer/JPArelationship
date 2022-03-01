package com.example.relationships.rest.dto;

import lombok.Data;

@Data
public class ItemDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private byte[] image;
    private CategoryDTO category;

    public ItemDTO() {
    }

    public ItemDTO(Long id, String name, String description, Double price, byte[] image, CategoryDTO category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
    }
}
