package com.acn.stickerboot.catalog;

import com.acn.stickerboot.catalog.data.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CatalogService {

    Item getItemById(Long id);

    Page<Item> listItems(Pageable pageable);

    Item createItem(Item item);

    Item updateItemById(Long id, Item item);

    void deleteById(Long id);
}
