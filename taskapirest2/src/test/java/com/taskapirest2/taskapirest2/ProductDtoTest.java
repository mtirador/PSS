package com.taskapirest2.taskapirest2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductDtoTest {

    @Test
    public void testConstructors() {
        Product product = new Product(1, "Potato", "Vegetable", 12.3, "Food");
        ProductDto productDto = new ProductDto(product);

        assertEquals("Potato", productDto.getName());
        assertEquals("Vegetable", productDto.getDescription());
        assertEquals(12.3, productDto.getPrice());
        assertEquals("Food", productDto.getType());
    }

    @Test
    public void testAccessorsAndMutators() {
        ProductDto productDto = new ProductDto();
        productDto.setName("Potato");
        productDto.setDescription("Vegetable");
        productDto.setPrice(12.3);
        productDto.setType("Food");

        assertEquals("Potato", productDto.getName());
        assertEquals("Vegetable", productDto.getDescription());
        assertEquals(12.3, productDto.getPrice());
        assertEquals("Food", productDto.getType());
    }
}
