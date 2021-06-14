package be.kuleuven.groept.softdev.part7.invoice;

public interface InvoiceFormatter {
    String formatHeader();
    String formatLineItem(LineItem item);
    String formatFooter(double total);
}
