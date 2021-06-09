package com;

import java.io.Serializable;

public class ProductBean implements Serializable {
    private String productName;
    private String price;

    public ProductBean() {
    }

    public ProductBean(String productName, String price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}