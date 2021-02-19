package softdev.Lab_session.Lab_1_2.Ex2_shapes;

import java.awt.Canvas;
import java.awt.geom.Ellipse2D;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class Circle extends Myshape
{
    private int diameter;

    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        diameter = 68;
        xPosition = 230;
        yPosition = 90;
        color = "blue";
    }

    public void changeSize(int newDiameter)
    {
        erase();
        diameter = newDiameter;
        draw();
    }
    /**
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = java.awt.Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition,
                                                          diameter, diameter));
            canvas.wait(10);
        }
    }

}
