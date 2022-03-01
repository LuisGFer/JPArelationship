package com.example.relationships.service;

import com.example.relationships.rest.dto.CategoryDTO;
import com.example.relationships.rest.dto.ItemDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    List<ItemDTO> getAllItems();
    ItemDTO getItem(Long id);
}
