package com.taskapirest2.taskapirest2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductControllerTest {

    private ProductService productService;
    private List<Product> productList;

    @BeforeEach
    public void setUp() {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Potato", "Vegetable", 12.3, "Food"));
        productList.add(new Product(2, "Carrot", "Vegetable", 8.5, "Food"));
        productList.add(new Product(3, "Apple", "Fruit", 5.0, "Food"));

        productService = new ProductService(productList);
    }


    @Test
    public void testShowProducts(){
        List<Product> allProducts = productService.showAllProducts();

        assertEquals(allProducts, productList);
        assertEquals(3, productList.size());
    }

    @Test
    public void testSearchForId(){
        int id = 1;
        Product testProduct = new Product(1, "Potato", "Vegetable", 12.3, "Food");

        Product actualProduct = productService.searchForId(id);


        assertEquals(testProduct.toString(), actualProduct.toString());
    }
    


    @Test
    public void testCreateProduct(){
        Product newProduct = new Product(4, "Banana", "Fruit", 2.0, "Food");
        String result = productService.createProduct(newProduct);
        assertEquals("Product created", result);
        assertEquals(4, productList.size());
    }

    @Test
    public void testdeleteProduct(){
        int id=1;
        String actualProduct = productService.deleteProduct(id);

        assertEquals("Product deleted successfully", actualProduct);
        
    }

   





}
