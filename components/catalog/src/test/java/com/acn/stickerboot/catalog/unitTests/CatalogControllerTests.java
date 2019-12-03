package com.acn.stickerboot.catalog.unitTests;

import com.acn.stickerboot.catalog.CatalogController;
import com.acn.stickerboot.catalog.CatalogServiceImpl;
import com.acn.stickerboot.catalog.data.Item;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.*;

@DisplayName("Catalog Controller Unit Tests")
@ExtendWith(MockitoExtension.class)
public class CatalogControllerTests {

    @Mock
    CatalogServiceImpl catalogService;

    @InjectMocks
    CatalogController catalogController;

    Item testItem_1;
    Item testItem_2;

    @BeforeEach
    void initializeTestData() {
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
    public void list__test() {
        Pageable pageable = PageRequest.of(1, 2);
        List<Item> testItems = Arrays.asList(testItem_1, testItem_2);
        Page<Item> page = new PageImpl<>(testItems, pageable, testItems.size());

        when(catalogService.listItems(pageable)).thenReturn(page);

        Page<Item> result = catalogController.list(pageable);

        verify(catalogService).listItems(pageable);
        assertEquals(testItems.size(), result.getNumberOfElements());
        assertIterableEquals(testItems, result.toList());
    }

    @Test
    public void getById__test() {
        when(catalogService.getItemById(testItem_1.getId())).thenReturn(testItem_1);

        Item result = catalogController.getById(testItem_1.getId());

        verify(catalogService).getItemById(testItem_1.getId());
        assertEquals(testItem_1, result);
    }

    @Test
    public void create__test() {
        when(catalogService.createItem(testItem_1)).thenReturn(testItem_1);

        Item result = catalogController.create(testItem_1);

        verify(catalogService, atLeastOnce()).createItem(testItem_1);
        assertEquals(testItem_1, result);

    }

    @Test
    public void update__test() {
        when(catalogService.updateItemById(testItem_1.getId(), testItem_1)).thenReturn(testItem_1);

        Item result = catalogController.update(testItem_1.getId(), testItem_1);

        verify(catalogService, atLeastOnce()).updateItemById(testItem_1.getId(), testItem_1);
        assertEquals(testItem_1, result);
    }

    @Test
    public void delete__test() {
        doNothing().when(catalogService).deleteById(testItem_1.getId());

        catalogController.delete(testItem_1.getId());

        verify(catalogService, times(1)).deleteById(testItem_1.getId());
    }

}
