package com.taskapirest2.taskapirest2;


class Product {

    private int idProduct;
    private String name;
    private String description;
    private double price;
    private String type;

    
    public Product(){

    }

    public Product(int idProduct, String name, String description, double price, String type) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
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


    @Override
    public String toString() {
        return "Product [Code Product=" + idProduct + ", name=" + name + ", description=" + description + ", price="
                + price + ", type=" + type + "]";
    }

    

     
}