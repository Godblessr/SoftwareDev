package be.kuleuven.groept.softdev.part7.invoice;

public class SimpleFormatter implements InvoiceFormatter {
    @Override
    public String formatHeader() {
        return "  I N V O I C E\n\n";
    }

    @Override
    public String formatLineItem(LineItem item) {
        return item.getDescription() + ": " + item.getPrice() + " euro";
    }

    @Override
    public String formatFooter(double total) {
        return "\n\nTOTAL AMOUNT DUE: " + total + " euro";
    }
}
