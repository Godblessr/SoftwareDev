package be.kuleuven.groept.softdev.part7.invoice;

public class Product implements LineItem {
    private String description;
    private double price; // BigDecimal

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
