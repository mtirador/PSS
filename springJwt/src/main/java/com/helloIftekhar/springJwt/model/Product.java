package com.helloIftekhar.springJwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idProduct;
    
    private String name;
    private String description;
    private double price;
    private String type;
    private int stock;

    public Product(){

    }

    public Product(int idProduct, String name, String description, double price, String type, int stock) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
        this.stock = stock;
    }


    public int getIdProduct() {
        return idProduct;
    }


    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Product [idProduct=" + idProduct + ", name=" + name + ", description=" + description + ", price="
                + price + ", type=" + type + ", stock=" + stock + "]";
    }
    
   


}
