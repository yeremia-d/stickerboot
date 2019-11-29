package com.acn.stickerboot.catalog;


import com.acn.stickerboot.catalog.data.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/catalog")
public class CatalogController {

    @GetMapping
    public Page<Item> list(@RequestParam(required = false) Pageable page) {
        return null;
    }

    @GetMapping("/{id}")
    public Item getById(Long id) {
        return null;
    }

    @PostMapping
    public Item create(Item item) {
        return null;
    }

    @PutMapping
    public Item update(Item item) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {

    }
}
