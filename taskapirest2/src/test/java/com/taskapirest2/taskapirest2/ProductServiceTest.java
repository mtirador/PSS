package com.taskapirest2.taskapirest2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

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
    public void testSearchForId() {
        Product foundProduct = productService.searchForId(1);
        assertNotNull(foundProduct);
        assertEquals("Potato", foundProduct.getName());
    }

    @Test
    public void testSearchForIdNotFound() {
        Product foundProduct = productService.searchForId(4);
        assertNull(foundProduct);
    }

    @Test
    public void testShowAllProducts() {
        List<Product> allProducts = productService.showAllProducts();
        assertEquals(3, allProducts.size());
    }

    @Test
    public void testCreateProduct() {
        Product newProduct = new Product(4, "Banana", "Fruit", 2.0, "Food");
        String result = productService.createProduct(newProduct);
        assertEquals("Product created", result);
        assertEquals(4, productList.size());
    }

    @Test
    public void testUpdateProduct() {
        Product updatedProduct = new Product(1, "Updated Potato", "Updated Vegetable", 15.0, "Updated Food");
        String result = productService.updateProduct(updatedProduct);
        assertEquals("Updated Successfully", result);

        Product foundProduct = productService.searchForId(1);
        assertNotNull(foundProduct);
        assertEquals("Updated Potato", foundProduct.getName());
        assertEquals("Updated Vegetable", foundProduct.getDescription());
        assertEquals(15.0, foundProduct.getPrice());
        assertEquals("Updated Food", foundProduct.getType());
    }

    @Test
    public void testUpdateProductNotFound() {
        Product updatedProduct = new Product(4, "Updated Banana", "Updated Fruit", 3.0, "Updated Food");
        String result = productService.updateProduct(updatedProduct);
        assertEquals("Product not found", result);
    }

    @Test
    public void testDeleteProduct(){
        int idProduct=1;
       
        String result = productService.deleteProduct(idProduct);
        assertEquals("Product deleted successfully", result);
        assertNull(productService.searchForId(idProduct));
       
    }

}
