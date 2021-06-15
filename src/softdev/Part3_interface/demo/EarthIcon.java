package softdev.Part3_interface.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EarthIcon implements Icon {
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y, 50, 50);
        graphics2D.setColor(Color.BLUE);
        graphics2D.fill(planet);
    }

    @Override
    public int getIconWidth() {
        return 500;
    }

    @Override
    public int getIconHeight() {
        return 100;
    }

    public void blablabla() {
    }
}
