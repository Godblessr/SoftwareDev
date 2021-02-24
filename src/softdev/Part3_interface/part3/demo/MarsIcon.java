package be.kuleuven.groept.softdev.part3.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MarsIcon implements Icon {

    private int size;

    public MarsIcon(int size) {
        this.size = size;
    }

    public MarsIcon() {
        this(15);
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y, size, size);
        graphics2D.setColor(Color.RED);
        graphics2D.fill(planet);
    }

    @Override
    public int getIconWidth() {
        return size;
    }

    @Override
    public int getIconHeight() {
        return size;
    }
}
