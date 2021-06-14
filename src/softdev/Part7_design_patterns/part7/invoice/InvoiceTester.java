package be.kuleuven.groept.softdev.part7.invoice;

public class InvoiceTester {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addInvoiceListeners(i -> System.out.println(i.format(new HTMLFormatter())));

        LineItem racket = new Product("Yonex", 125.50);
        LineItem shuttles = new Product("Aerosensa 20", 24.30);

        invoice.addItem(racket);
        invoice.addItem(shuttles);

        Bundle racketsAndShuttles = new Bundle();
        racketsAndShuttles.addToBundle(racket);
        racketsAndShuttles.addToBundle(shuttles);
        invoice.addItem(racketsAndShuttles);

        LineItem discountedItem = new DiscountedItem(new Product("old racket", 125.0), 10.0);
        invoice.addItem(discountedItem);

        invoice.addItem(new DiscountedItem(racketsAndShuttles, 25.0));

//        System.out.println(racketsAndShuttles.getDescription());
//        System.out.println(invoice.getTotal());
//
//        System.out.println(invoice.format(new SimpleFormatter()));

 //       System.out.println(invoice.format(new HTMLFormatter()));
    }
}
