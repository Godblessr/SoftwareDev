package be.kuleuven.groept.softdev.part7.invoice;

public class DiscountedItem implements LineItem {
    private LineItem item;
    private double discount;

    public DiscountedItem(LineItem item, double discount) {
        this.item = item;
        this.discount = discount;
    }

    @Override
    public String getDescription() {
        return "Discounted item [" + item.getDescription() + "; discount: " + discount + "%]";
    }

    @Override
    public double getPrice() {
        return item.getPrice() * (1 - discount/100);
    }
}
