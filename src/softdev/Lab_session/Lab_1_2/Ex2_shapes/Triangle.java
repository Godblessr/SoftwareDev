package softdev.Lab_session.Lab_1_2.Ex2_shapes;

import java.awt.*;
import java.awt.Canvas;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class Triangle extends Myshape
{
    private int height;
    private int width;

    /**
     * Create a new triangle at default position with default color.
     */
    public Triangle()
    {
        height = 60;
        width = 70;
        xPosition = 210;
        yPosition = 140;
        color = "green";
        isVisible = false;
    }
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }
    /**
     * Draw the triangle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            java.awt.Canvas canvas = java.awt.Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + (width/2), xPosition - (width/2) };
            int[] ypoints = { yPosition, yPosition + height, yPosition + height };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

}
