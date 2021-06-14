package be.kuleuven.groept.softdev.part7.invoice;

public class HTMLFormatter implements  InvoiceFormatter {
    @Override
    public String formatHeader() {
        return "<!DOCTYPE html>\n<html>\n<head><title>Invoice</title></head>\n<body>\n<h1>Invoice</h1>\n<ul>\n";
    }

    @Override
    public String formatLineItem(LineItem item) {
        return "<li>" + item.getDescription() + ":&nbsp;&euro;&nbsp;" + item.getPrice() + "</li>";
    }

    @Override
    public String formatFooter(double total) {
        return "\n</ul>\n<h3>Total:&nbsp;&euro;&nbsp;" + total + "</h3>\n</body>\n</html>";
    }
}
