package com.flipperch.product_backend.models;

public class Product {
    
    //Atributos
    private int id;
    private String name;
    private String description;
    private double price;
    private boolean promotional; // Indica se o produto está em promoção
    private boolean newProduct; // Indica se o produto é um lançamento
    private int categoryId; // Categoria do produto

    //Métodos construtores

    public Product(int id, String name, String description, double price, boolean promotional, boolean newProduct, int categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.promotional = promotional;
        this.newProduct = newProduct;
        this.categoryId = categoryId;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    //Métodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public boolean getPromotional() {
        return promotional;
    }
    public void setPromotional(boolean promotional) {
        this.promotional = promotional;
    }
    public boolean getNewProduct() {
        return newProduct;
    }
    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
