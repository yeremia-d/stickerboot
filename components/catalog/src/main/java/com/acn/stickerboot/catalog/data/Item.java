package com.acn.stickerboot.catalog.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@Table(name = "catalog_items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotEmpty
    String name;

    String description;

    @NotNull(message = "basePrice cannot be empty")
    float basePrice;

    @OneToMany(orphanRemoval = true)
    List<ItemVariation> variations;
}
