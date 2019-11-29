package com.acn.stickerboot.catalog;

import com.acn.stickerboot.catalog.data.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@Transactional
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public Item getItemById(Long id) {
        return catalogRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("No Item with id " + id));
    }

    @Override
    public Page<Item> listItems(Pageable pageable) {
        return catalogRepository.findAll(pageable);
    }

    @Override
    public Item addItem(Item item) {
        return catalogRepository.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        return catalogRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        catalogRepository.deleteById(id);
    }
}
