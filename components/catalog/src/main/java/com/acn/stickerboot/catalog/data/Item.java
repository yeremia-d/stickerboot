package com.acn.stickerboot.catalog.data;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@Entity
//@Table(name = "catalog_items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull(message = "Item name cannot be blank")
    String name;

    String description;

    @NotNull(message = "basePrice cannot be blank")
    float basePrice;

    @OneToMany(orphanRemoval = true)
    List<ItemVariation> variations;

}
