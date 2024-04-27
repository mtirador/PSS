package com.taskapirest.taskapirest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/product")
public class ProductController {

    private List<Product> productList = new ArrayList<>();

    public ProductController() {
        productList.add(new Product(1, "Potato", "Vegetable", 12.3, "Food"));
        productList.add(new Product(2, "Carrot", "Vegetable", 8.5, "Food"));
        productList.add(new Product(3, "Apple", "Fruit", 5.0, "Food"));
    }

    @GetMapping("/searchForId")
    public Product searchForId(@RequestParam int id) {
        for (Product product : productList) {
            if (product.getIdProduct() == id) {
                return product;
            }
        }

        return null; 
    }

    @GetMapping("/showAllProducts")
    public List<Product> showAllProducts() {
        return productList;
    }

    @PostMapping
    public String createProduct(@RequestBody Product product) {
        productList.add(product);
        return "Product created";
    }

    @PutMapping
    public String updateProducString(@RequestBody Product updatedProduct) {
      
        for (Product product : productList) {
            if(product.getIdProduct()== updatedProduct.getIdProduct()){
                product.setName(updatedProduct.getName());
                product.setDescription(updatedProduct.getDescription());
                product.setPrice(updatedProduct.getPrice());
                product.setType(updatedProduct.getType());
            }
        } 
        return "Updated Syccessfully";
    }

}
