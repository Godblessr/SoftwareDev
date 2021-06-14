package be.kuleuven.groept.softdev.part7.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bundle implements LineItem {
    private List<LineItem> items = new ArrayList<>();

    public void addToBundle(LineItem item) {
        items.add(item);
    }

    @Override
    public String getDescription() {
        return "Bundle [" +
                items.stream()
                .map(LineItem::getDescription)
                .collect(Collectors.joining(", ")) + "]";
    }

    @Override
    public double getPrice() {
        return items.stream()
                .mapToDouble(LineItem::getPrice)
                .sum();
    }
}
