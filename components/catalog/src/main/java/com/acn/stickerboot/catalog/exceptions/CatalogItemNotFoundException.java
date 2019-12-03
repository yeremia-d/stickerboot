package com.acn.stickerboot.catalog.exceptions;

public class CatalogItemNotFoundException extends RuntimeException {

    public CatalogItemNotFoundException() {
        super("Catalog item not found");
    }

    public CatalogItemNotFoundException(Long id) {
        super("Catalog item with id " + id + " not found");
    }
}
