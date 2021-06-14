package be.kuleuven.groept.softdev.part7.invoice;

@FunctionalInterface
public interface InvoiceListener {
    void invoiceChanged(Invoice invoice);
}
