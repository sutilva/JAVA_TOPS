package com.assessment1;



// Product class to represent a product in the inventory
class Product {
    private String productId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productCompany;

    public Product(String productId, String productName, double productPrice, int productQuantity, String productCompany) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productCompany = productCompany;
    }

    // Getters and setters for product attributes
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Price: " + productPrice +
                ", Quantity: " + productQuantity +
                ", Company: " + productCompany;
    }
}


