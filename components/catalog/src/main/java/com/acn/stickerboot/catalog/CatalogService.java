package com.acn.stickerboot.catalog;

import com.acn.stickerboot.catalog.data.Item;
import org.springframework.data.domain.Page;

public interface CatalogService {

    Item getItemById(Long id);

    Page<Item> listItems();

    Item addItem();

    Item updateItem();

    void deleteById(Long id);
}
