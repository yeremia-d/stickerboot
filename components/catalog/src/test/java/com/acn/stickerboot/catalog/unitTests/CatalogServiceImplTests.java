package com.acn.stickerboot.catalog.unitTests;

import com.acn.stickerboot.catalog.CatalogRepository;
import com.acn.stickerboot.catalog.CatalogServiceImpl;
import com.acn.stickerboot.catalog.data.Item;
import com.acn.stickerboot.catalog.exceptions.CatalogItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
@DisplayName("Unit Tests for CatalogServiceImpl")
public class CatalogServiceImplTests {

    @Mock
    CatalogRepository catalogRepository;

    @InjectMocks
    CatalogServiceImpl catalogService;

    // Test Data
    Item testItem_1;
    Item testItem_2;

    @BeforeEach
    public void initTestData() {
        testItem_1 = Item.builder()
                .id(1L)
                .name("Item1")
                .basePrice(5.99f)
                .build();

        testItem_2 = Item.builder()
                .id(2L)
                .name("Item2")
                .basePrice(0.99f)
                .build();
    }

    @Test
    @DisplayName("getElementById when an item is found")
    public void getItemById__Test() {
        when(catalogRepository.findById(testItem_1.getId())).thenReturn(Optional.of(testItem_1));

        Item result = catalogService.getItemById(testItem_1.getId());

        verify(catalogRepository).findById(testItem_1.getId());
        assertEquals(testItem_1.getId(), result.getId());
    }

    @Test
    @DisplayName("getItemById when no item is found")
    public void getItemById_NoElement__Test() {
        when(catalogRepository.findById(0L)).thenReturn(Optional.empty());

        assertThrows(CatalogItemNotFoundException.class, () -> catalogService.getItemById(0L));
    }

    @Test
    @DisplayName("listItems when 2 items are found")
    public void listItems__Test() {
        Pageable testPageable = PageRequest.of(1, 2);
        List<Item> items = Arrays.asList(testItem_1, testItem_2);
        Page<Item> itemsPage = new PageImpl<>(items, testPageable, items.size());

        when(catalogRepository.findAll(testPageable)).thenReturn(itemsPage);

        Page<Item> result = catalogService.listItems(testPageable);

        verify(catalogRepository).findAll(testPageable);

        assertEquals(items.size(), result.getNumberOfElements());
        assertIterableEquals(items, result.toList());
    }

    @Test
    @DisplayName("createItem Test")
    public void createItem__Test() {
        when(catalogRepository.save(testItem_1)).thenReturn(testItem_1);

        Item result = catalogService.createItem(testItem_1);

        verify(catalogRepository, atLeastOnce()).save(testItem_1);
        assertEquals(testItem_1, result);
    }

    @Test
    @DisplayName("updateItemById Test")
    public void updateItemById__Test() {
        when(catalogRepository.save(testItem_1)).thenReturn(testItem_1);
        when(catalogRepository.findById(testItem_1.getId())).thenReturn(Optional.of(testItem_1));

        Item result = catalogService.updateItemById(testItem_1.getId(), testItem_1);

        verify(catalogRepository, atLeastOnce()).save(testItem_1);
        assertEquals(testItem_1, result);
    }

    @Test
    @DisplayName("deleteItem Test")
    void deleteById__Test() {
        doNothing().when(catalogRepository).deleteById(testItem_1.getId());

        catalogService.deleteById(testItem_1.getId());

        verify(catalogRepository, times(1)).deleteById(testItem_1.getId());
    }
}