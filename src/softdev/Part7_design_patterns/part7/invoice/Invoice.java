package be.kuleuven.groept.softdev.part7.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Invoice {
    private List<LineItem> items = new ArrayList<>();
    private List<InvoiceListener> listeners = new ArrayList<>();

    public void addItem(LineItem item) {
        items.add(item);
        listeners.forEach(l -> l.invoiceChanged(this));
    }

    public void addInvoiceListeners(InvoiceListener listener) {
        listeners.add(listener);
    }

    public double getTotal() {
        return items
                .stream()
                .mapToDouble(LineItem::getPrice)
                .sum();
    }

    public String format(InvoiceFormatter formatter) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatter.formatHeader());

        sb.append(items.stream()
                    .map(i -> formatter.formatLineItem(i))
                    .collect(Collectors.joining("\n")));

        sb.append(formatter.formatFooter(getTotal()));
        return sb.toString();
    }
}
