package com.acn.stickerboot.inventory;

import com.acn.stickerboot.inventory.data.InventoryItem;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

public interface InventoryService {
    InventoryItem addInventoryItems(@NotNull Long catalogItemVariationId, @Positive int numberOfItemsToAdd);

    InventoryItem removeInventoryItems(@NotNull Long catalogItemVariationId, @Positive int numberOfItemsToRemove);

    InventoryItem getInventoryByCatalogId(Long id);

    List<InventoryItem> ListInventoryItems(List<Long> id);

    /**
     * To be called when a catalog item is removed (async messaging)
     *
     * @param id ID of Inventory Item Entry
     */
    void deleteInventoryItemEntryById(Long id);
}
