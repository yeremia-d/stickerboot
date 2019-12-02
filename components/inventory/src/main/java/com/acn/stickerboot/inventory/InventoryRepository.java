package com.acn.stickerboot.inventory;

import com.acn.stickerboot.inventory.data.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {

    @Query("SELECT item FROM inventory_item item WHERE item.catalogItemVariationId = :itemId")
    Optional<InventoryItem> getByCatalogVariationId(@Param("itemId") Long catalogVariationId);
}
