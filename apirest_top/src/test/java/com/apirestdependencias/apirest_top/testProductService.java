package com.apirestdependencias.apirest_top;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class testProductService {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAllDao() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product 1", "Description 1", 10.0, "Type 1", 100));
        productList.add(new Product(2, "Product 2", "Description 2", 20.0, "Type 2", 200));
        when(productRepository.findAll()).thenReturn(productList);

        List<Product> result = productService.findAllDao();

        assertEquals(productList.size(), result.size());
        assertEquals(productList.get(0).getName(), result.get(0).getName());
        assertEquals(productList.get(1).getName(), result.get(1).getName());
    }

    @Test
    public void testSaveDao() {

        Product newProduct = new Product(1, "New Product", "New Description", 30.0, "New Type", 300);
        when(productRepository.save(newProduct)).thenReturn(newProduct);

        productService.saveDao(newProduct);

        verify(productRepository, times(1)).save(newProduct);
    }

    @Test
    public void testUpdateDao() {

        int productId = 1;
        Product existingProduct = new Product(productId, "Existing Product", "Existing Description", 20.0, "Existing Type", 200);
        when(productRepository.existsById(productId)).thenReturn(true);

        productService.updateDao(existingProduct);

        verify(productRepository, times(1)).save(existingProduct);
    }

    @Test
    public void testDeleteDao() {

        int productId = 1;
        Product productToDelete = new Product(productId, "Product to Delete", "Description", 10.0, "Type", 100);
        when(productRepository.existsById(productId)).thenReturn(true);

        productService.deleteDao(productToDelete);

        verify(productRepository, times(1)).delete(productToDelete);
    }

    @Test
    public void testFindIdDao() {
        int productId = 1;
        Product product = new Product(productId, "Product", "Description", 10.0, "Type", 100);
        when(productRepository.findById(productId)).thenReturn(Optional.of(product));

        Product result = productService.findIdDao(productId);

        assertEquals(product.getIdProduct(), result.getIdProduct());
        assertEquals(product.getName(), result.getName());
        assertEquals(product.getDescription(), result.getDescription());
        assertEquals(product.getPrice(), result.getPrice());
        assertEquals(product.getType(), result.getType());
        assertEquals(product.getStock(), result.getStock());
    }
}
