package com.acn.stickerboot.catalog.unitTests;

import com.acn.stickerboot.catalog.CatalogRepository;
import com.acn.stickerboot.catalog.CatalogService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CatalogServiceTests {

    @Mock
    CatalogRepository catalogRepository;

    @InjectMocks
    CatalogService catalogService;

    @Test
    public void getItemByIdTest() {
    }

    @Test
    public void listItemsTest() {
    }

    @Test
    public void createItemTest() {
    }

    @Test
    public void updateItemTest() {
    }

    @Test
    void deleteByIdTest() {
    }
}
