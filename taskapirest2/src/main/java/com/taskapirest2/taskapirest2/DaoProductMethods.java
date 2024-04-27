package com.taskapirest2.taskapirest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DaoProductMethods implements ProductDAO {

    
        private List<Product> productList;

    public DaoProductMethods() {
        this.productList = new ArrayList<>();
        
        loadDataFromFile("C:\\Users\\mtirador\\Desktop\\Practicas\\taskapirest2\\src\\main\\java\\com\\taskapirest2\\taskapirest2\\supermarket.txt"); 
    }

    private void loadDataFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); 
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String description = parts[2];
                double price = Double.parseDouble(parts[3]);
                String type = parts[4];
                productList.add(new Product(id, name, description, price, type));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
        @Override
        public Product searchById(int id) {
            for (Product product : productList) {
                if (product.getIdProduct() == id) {
                    return product;
                }
            }
            return null; 
        }
    
        @Override
        public List<Product> findAllDao() {
            return productList;
        }
    
        @Override
        public void saveProductDao(Product product) {
            productList.add(product);
        }
    
        @Override
        public void updateProductDao(Product product) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getIdProduct() == product.getIdProduct()) {
                    productList.set(i, product);
                    return;
                }
            }
            throw new IllegalArgumentException("Product not found");
        }
    
        @Override
        public void deleteProductDao(Product product) {
            productList.remove(product);
        }
    }
    

