package be.kuleuven.groept.softdev.part7.marker.interfacedemo;

import java.io.Serializable;

public class Product implements Shippable, Serializable { //"marked"
    private String productID;
    private String description;
    private double price;

    public Product(String productID, String description, double price) {
        this.productID = productID;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
