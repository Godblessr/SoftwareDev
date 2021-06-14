package be.kuleuven.groept.softdev.part7.marker.annotationdemo;

@Shippable //"marked"
public class Product  {
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
