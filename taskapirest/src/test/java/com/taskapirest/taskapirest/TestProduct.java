package com.taskapirest.taskapirest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestProduct {

	private List<Product> productList = new ArrayList<>();
	@BeforeEach
	void app(){
		productList = new ArrayList<>();
        productList.add(new Product(1, "Potato", "Vegetable", 12.3, "Food"));
        productList.add(new Product(2, "Carrot", "Vegetable", 8.5, "Food"));
        productList.add(new Product(3, "Apple", "Fruit", 5.0, "Food"));
	}

	@Test
	void testSizeProduct() {
        List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Potato", "Vegetable", 12.3, "Food"));
        products.add(new Product(2, "Carrot", "Vegetable", 8.5, "Food"));
        products.add(new Product(3, "Apple", "Fruit", 5.0, "Food"));
        assertEquals(productList.size(), products.size());   
    }

	@Test
	void testContainsList(){
		List<Product>products =new ArrayList<>();
		products.add(new Product(1, "Potato", "Vegetable", 12.3, "Food"));
        products.add(new Product(2, "Carrot", "Vegetable", 8.5, "Food"));
        products.add(new Product(3, "Apple", "Fruit", 5.0, "Food"));
		assertEquals(products.toString(),productList.toString());
	}


	@Test
	void testCreatedProduct(){
		List<Product>products =new ArrayList<>();
		products.add(new Product(1, "Potato", "Vegetable", 12.3, "Food"));
        products.add(new Product(2, "Carrot", "Vegetable", 8.5, "Food"));
        products.add(new Product(3, "Apple", "Fruit", 5.0, "Food"));
		assertEquals(3, productList.size());
	}

	
	





}
