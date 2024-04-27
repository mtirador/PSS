package com.apirestdependencias.apirest_top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

 @Autowired
    private ProductService productService;
    

    @GetMapping("/getAll")
    public List<Product> findAllDao() {
        return productService.findAllDao();
    }

    @PostMapping("/dao/saveProduct")
    public String saveProductUsingDao(@RequestBody Product product) {
        try {
            productService.saveDao(product);
            return "Product saved successfully using DAO";
        } catch (Exception e) {
            return "Failed to save the product using DAO";
        }
    }

    @GetMapping("/dao/getById/{id}")
    public Product getProductByIdUsingDao(@PathVariable int id) {
    try {
        return productService.findIdDao(id);
    } catch (Exception e) {
        System.out.println("Something went wrong, unable to get this product using DAO");
        return null;
    }
}


@PutMapping("/dao/updateProduct/{id}")
public String updateProductUsingDao(@PathVariable int id, @RequestBody Product product) {
    try {
        product.setIdProduct(id);
        productService.updateDao(product);
        return "Product updated successfully using DAO";
    } catch (Exception e) {
        return "Failed to update product using DAO";
    }
}

@DeleteMapping("/dao/delete/{id}")
public String deleteProductUsingDao(@PathVariable int id) {
    try {
        Product productToDelete = productService.findIdDao(id);
        if (productToDelete != null) {
            productService.deleteDao(productToDelete);
            return "Product deleted successfully using DAO";
        } else {
            return "Product not found";
        }
    } catch (Exception e) {
        return "Failed to delete product using DAO";
    }
}


}
