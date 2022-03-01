package com.example.relationships.rest.mapper;

import com.example.relationships.model.Category;
import com.example.relationships.model.Item;
import com.example.relationships.rest.dto.CategoryDTO;
import com.example.relationships.rest.dto.ItemDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface ItemMapper {
    ItemDTO itemToItemDTO(Item item);
    List<ItemDTO> itemsToItemsDTO(List<Item> items);
}
