package com.acn.stickerboot.inventory;

import com.acn.stickerboot.inventory.data.InventoryItem;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public InventoryItem getItemByCatalogId(@RequestParam Long inventoryId) {
        return inventoryService.getInventoryByCatalogId(inventoryId);
    }

    @PostMapping("/add")
    public InventoryItem addInventoryByCatalogId(@RequestParam Long catalogVariationId, @RequestParam Integer amount) {
        return inventoryService.addInventoryItems(catalogVariationId, amount);
    }

    @PostMapping("/remove")
    public InventoryItem removeInventoryByCatalogId(@RequestParam Long catalogVariationId, @RequestParam Integer amount) {
        return inventoryService.removeInventoryItems(catalogVariationId, amount);
    }
}
