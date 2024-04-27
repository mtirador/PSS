package com.helloIftekhar.springJwt.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.helloIftekhar.springJwt.model.Product;
import com.helloIftekhar.springJwt.service.ProductService;


public class ProductControllerTest {

    @Mock
    private ProductService productServiceMock;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindAllDao() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product A", "Description for Product A", 10.99, "Type A", 100));

        when(productServiceMock.findAllDao()).thenReturn(productList);

        List<Product> result = productController.findAllDao();

        assertNotNull(result);
        assertEquals(productList.size(), result.size());
        for (int i = 0; i < productList.size(); i++) {
            assertEquals(productList.get(i), result.get(i));
        }
    }


    @Test
    public void testSaveProductUsingDao() {
        Product product = new Product(1, "Product A", "Description for Product A", 10.99, "Type A", 100);

        doNothing().when(productServiceMock).saveDao(product);

        String result = productController.saveProductUsingDao(product);

        assertEquals("Product saved successfully using DAO", result);
    }

    @Test
    public void testGetProductByIdUsingDao() {
        int id = 1;
        Product product = new Product(id, "Product A", "Description for Product A", 10.99, "Type A", 100);

        when(productServiceMock.findIdDao(id)).thenReturn(product);

        Product result = productController.getProductByIdUsingDao(id);

        assertNotNull(result);
        assertEquals(product, result);
    }

    @Test
    public void testUpdateProductUsingDao() {
        int id = 1;
        Product product = new Product(id, "Product A", "Description for Product A", 10.99, "Type A", 100);

        doNothing().when(productServiceMock).updateDao(product);

        String result = productController.updateProductUsingDao(id, product);

        assertEquals("Product updated successfully using DAO", result);
    }

    @Test
    public void testDeleteProductUsingDao() {
        int id = 1;
        Product product = new Product(id, "Product A", "Description for Product A", 10.99, "Type A", 100);

        when(productServiceMock.findIdDao(id)).thenReturn(product);

        doNothing().when(productServiceMock).deleteDao(product);

 
        String result = productController.deleteProductUsingDao(id);

        assertEquals("Product deleted successfully using DAO", result);
    }

    @Test
    public void testDeleteProductUsingDao_ProductNotFound() {
        int id = 1;

        when(productServiceMock.findIdDao(id)).thenReturn(null);

        String result = productController.deleteProductUsingDao(id);

        assertEquals("Product not found", result);
    }


  
}
