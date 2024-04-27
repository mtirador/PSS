package com.taskapirest2.taskapirest2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList;

    public ProductService(List<Product> productList) {
        this.productList = productList;
    }

    public Product searchForId(int id) {
        for (Product product : productList) {
            if (product.getIdProduct() == id) {
                return product;
            }
        }
        return null;
    }

    //dto
    public List<ProductDto> showAllProductDtos() {
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : productList) {
            productDtoList.add(new ProductDto(product));
        }
        return productDtoList;
    }

    public List<Product> showAllProducts() {
        return productList;
    }

    public String createProduct(Product product) {
        productList.add(product);
        return "Product created";
    }

    public String updateProduct(Product updatedProduct) {
        for (Product product : productList) {
            if (product.getIdProduct() == updatedProduct.getIdProduct()) {
                product.setName(updatedProduct.getName());
                product.setDescription(updatedProduct.getDescription());
                product.setPrice(updatedProduct.getPrice());
                product.setType(updatedProduct.getType());
                return "Updated Successfully";
            }
        }
        return "Product not found";
    }

    public String deleteProduct(int id) {
        Product productToDelete = null;
        for (Product product : productList) {
            if (product.getIdProduct() == id) {
                productToDelete = product;
                break;
            }
        }
        if (productToDelete != null) {
            productList.remove(productToDelete);
            return "Product deleted successfully";
        } else {
            return "Product with ID " + id + " not found";
        }
    }
    
    

    

}
