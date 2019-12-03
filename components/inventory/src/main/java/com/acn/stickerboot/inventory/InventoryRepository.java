package com.acn.stickerboot.inventory;

import com.acn.stickerboot.inventory.data.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {

    @Query("select item from InventoryItem item where item.catalogItemVariationId = :itemId")
    Optional<InventoryItem> getByCatalogVariationId(@Param("itemId") Long catalogVariationId);

    @Query("select item from InventoryItem where item.catalogItemVariationId in :catalogVariationIds")
    List<InventoryItem> getInventoryItemsInCatalogItems(@Param("catalogVariationIds") List<Long> catalogVariationIds);
}
