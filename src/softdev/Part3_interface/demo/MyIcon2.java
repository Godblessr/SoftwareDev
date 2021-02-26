package softdev.Part3_interface.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyIcon2 implements Icon {
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        System.out.println("paintIcon called...");
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y, 150, 250);
        graphics2D.setColor(Color.CYAN);
        graphics2D.fill(planet);
    }

    @Override
    public int getIconWidth() {
        System.out.println("getIconWidth called...");
        return 150;
    }

    @Override
    public int getIconHeight() {
        System.out.println("getIconHeight called...");
        return 250;
    }
}
