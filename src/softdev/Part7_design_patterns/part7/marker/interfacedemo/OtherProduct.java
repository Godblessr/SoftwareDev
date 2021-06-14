package be.kuleuven.groept.softdev.part7.marker.interfacedemo;

public class OtherProduct { // not marked
    private String productID;
    private String description;
    private double price;

    public OtherProduct(String productID, String description, double price) {
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
