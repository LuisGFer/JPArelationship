package com.example.relationships.service.impl;

import com.example.relationships.model.Item;
import com.example.relationships.repository.ItemRepository;
import com.example.relationships.rest.dto.ItemDTO;
import com.example.relationships.rest.mapper.ItemMapper;
import com.example.relationships.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private ItemRepository repository;
    private ItemMapper mapper;

    public ItemServiceImpl(ItemRepository repository, ItemMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> items = this.repository.findAll();
        return mapper.itemsToItemsDTO(items);
    }

    @Override
    public ItemDTO getItem(Long id) {
        return null;
    }
}
