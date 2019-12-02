package com.acn.stickerboot.inventory;

import com.acn.stickerboot.inventory.data.InventoryItem;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class InventoryServiceImpl implements InventoryService {
    InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public InventoryItem addInventoryItems(@NotNull Long catalogItemVariationId, @Positive int numberOfItemsToAdd) {
        InventoryItem inventoryItem = inventoryRepository
                .getByCatalogVariationId(catalogItemVariationId)
                .orElse(InventoryItem.builder().catalogItemVariationId(catalogItemVariationId).quantityInStock(0).build());

        Integer updatedQuantityInStock = inventoryItem.getQuantityInStock() + numberOfItemsToAdd;

        inventoryItem.setQuantityInStock(updatedQuantityInStock);

        return inventoryRepository.save(inventoryItem);
    }

    @Override
    public InventoryItem removeInventoryItems(@NotNull Long catalogItemVariationId, @Positive int numberOfItemsToRemove) {
        InventoryItem inventoryItem = inventoryRepository
                .getByCatalogVariationId(catalogItemVariationId)
                .orElseThrow(() -> new NoSuchElementException("No Inventory with catalog variation id " + catalogItemVariationId));

        Integer updatedQuantityInStock = Math.max(inventoryItem.getQuantityInStock() - numberOfItemsToRemove, 0);

        inventoryItem.setQuantityInStock(updatedQuantityInStock);

        return inventoryRepository.save(inventoryItem);
    }

    @Override
    public InventoryItem getInventoryByCatalogId(Long id) {
        return inventoryRepository
                .getByCatalogVariationId(id)
                .orElseThrow(() -> new NoSuchElementException("No Inventory Item with catalog variation id " + id));
    }

    @Override
    public List<InventoryItem> ListInventoryItems(List<Long> id) {
        return null;
    }

    @Override
    public void deleteInventoryItemEntryById(Long id) {

    }
}
