package com.example.relationships.rest.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private byte[] image;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, byte[] image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }
}
