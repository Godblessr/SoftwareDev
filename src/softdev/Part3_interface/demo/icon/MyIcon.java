package softdev.Part3_interface.demo.icon;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyIcon implements Icon {
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y, 100, 100);
        graphics2D.setColor(Color.CYAN);
        graphics2D.fill(planet);
    }

    @Override
    public int getIconWidth() {
        return 100;
    }

    @Override
    public int getIconHeight() {
        return 100;
    }
}
