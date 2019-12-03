package com.acn.stickerboot.catalog;


import com.acn.stickerboot.catalog.data.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping
    public Page<Item> list(Pageable page) {
        return catalogService.listItems(page);
    }

    @GetMapping("/{id}")
    public Item getById(@PathVariable Long id) {
        return catalogService.getItemById(id);
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return catalogService.createItem(item);
    }

    @PutMapping("/{id}")
    public Item update(@PathVariable Long id, @RequestBody Item item) {
        return catalogService.updateItemById(id, item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        catalogService.deleteById(id);
    }
}
