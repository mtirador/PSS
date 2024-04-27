package com.taskapirest2.taskapirest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
    private  ProductService productService;

  
    public ProductController(ProductService productService) {
        this.productService = productService;
           
         productService.createProduct(new Product(1, "Potato", "Vegetable", 12.3, "Food"));
         productService.createProduct(new Product(2, "Carrot", "Vegetable", 8.5, "Food"));
         productService.createProduct(new Product(3, "Apple", "Fruit", 5.0, "Food"));
    }

    @GetMapping("/searchForId")
    public Product searchForId(@RequestParam int id) {
        return productService.searchForId(id);
    }

    @GetMapping("/showAllProducts")
    public List<Product> showAllProducts() {
        return productService.showAllProducts();
    }

    @PostMapping
    public String createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping
    public String updateProduct(@RequestBody Product updatedProduct) {
        return productService.updateProduct(updatedProduct);
    }

    //dto
    @GetMapping("/showAlldto")
    public List<ProductDto> showAllProductsDto() {
        List<ProductDto> productDtoList = productService.showAllProductDtos();
        return productDtoList;
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

}
