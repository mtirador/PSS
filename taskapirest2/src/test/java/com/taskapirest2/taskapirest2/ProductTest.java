package com.taskapirest2.taskapirest2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testConstructors() {
        Product product = new Product(1, "Potato", "Vegetable", 12.3, "Food");
        assertEquals(1, product.getIdProduct());
        assertEquals("Potato", product.getName());
        assertEquals("Vegetable", product.getDescription());
        assertEquals(12.3, product.getPrice());
        assertEquals("Food", product.getType());
    }

    @Test
    public void testAccessorsAndMutators() {
        Product product = new Product();
        product.setIdProduct(1);
        product.setName("Potato");
        product.setDescription("Vegetable");
        product.setPrice(12.3);
        product.setType("Food");

        assertEquals(1, product.getIdProduct());
        assertEquals("Potato", product.getName());
        assertEquals("Vegetable", product.getDescription());
        assertEquals(12.3, product.getPrice());
        assertEquals("Food", product.getType());
    }


    @Test
    public void testToString() {
        Product product = new Product(1, "Potato", "Vegetable", 12.3, "Food");
        String expectedString = "Product [Code Product=1, name=Potato, description=Vegetable, price=12.3, type=Food]";
        assertEquals(expectedString, product.toString());
    }
}
