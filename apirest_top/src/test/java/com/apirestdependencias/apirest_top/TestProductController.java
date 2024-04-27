package com.apirestdependencias.apirest_top;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestProductController {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    public void testGetAllProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product 1", "Description 1", 10.0, "Type 1", 100));
        productList.add(new Product(2, "Product 2", "Description 2", 20.0, "Type 2", 200));

        when(productService.findAllDao()).thenReturn(productList);
        List<Product> result = productController.findAllDao();

        assertEquals(productList.size(), result.size());
        assertEquals(productList.get(0).getName(), result.get(0).getName());
        assertEquals(productList.get(1).getName(), result.get(1).getName());
    }

    @Test
    public void testGetProductById() {
        int productId = 1;
        Product product = new Product(productId, "Product 1", "Description 1", 10.0, "Type 1", 100);
        when(productService.findIdDao(productId)).thenReturn(product);

        Product retrievedProduct = productController.getProductByIdUsingDao(productId);

        assertEquals(product.getIdProduct(), retrievedProduct.getIdProduct());
        assertEquals(product.getName(), retrievedProduct.getName());
        assertEquals(product.getDescription(), retrievedProduct.getDescription());
        assertEquals(product.getPrice(), retrievedProduct.getPrice());
        assertEquals(product.getType(), retrievedProduct.getType());
        assertEquals(product.getStock(), retrievedProduct.getStock());

        verify(productService, times(1)).findIdDao(productId);
    }
    
    @Test
    public void testUpdateProduct() {

        int productId = 1;
        Product updatedProduct = new Product(productId, "Updated Product", "Updated Description", 15.0, "Updated Type", 150);

        doNothing().when(productService).updateDao(updatedProduct);
        String result = productController.updateProductUsingDao(productId, updatedProduct);

        assertEquals("Product updated successfully using DAO", result);
        verify(productService, times(1)).updateDao(updatedProduct);
    }


    @Test
    public void testDeleteProduct() {
        int productId = 1;
       
        when(productService.findIdDao(productId)).thenReturn(null);

        String result = productController.deleteProductUsingDao(productId);

        assertEquals("Product not found", result);

        verify(productService, times(1)).findIdDao(productId);
        verify(productService, never()).deleteDao(any(Product.class));
    }

}
