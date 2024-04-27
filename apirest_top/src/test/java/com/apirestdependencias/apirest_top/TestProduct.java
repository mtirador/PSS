package com.apirestdependencias.apirest_top;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestProduct {

    @Mock
    ProductRepository productRepository; 

    @Test
    public void testProductConstructorAndGetters() {

        int idProduct = 1;
        String name = "Product 1";
        String description = "Description of Product 1";
        double price = 10.0;
        String type = "Type 1";
        int stock = 100;
        
        Product product = new Product(idProduct, name, description, price, type, stock);

        assertEquals(idProduct, product.getIdProduct());
        assertEquals(name, product.getName());
        assertEquals(description, product.getDescription());
        assertEquals(price, product.getPrice());
        assertEquals(type, product.getType());
        assertEquals(stock, product.getStock());
    }
}
