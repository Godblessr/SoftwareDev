package UIapplication;

import javax.swing.*;
import java.net.URL;

public abstract class Block extends JButton {

    protected int X;
    protected int Y;
    public GamePanel Panel;

    public Block(int X, int Y, URL filename, GamePanel Panel) {
        this.X = X;
        this.Y = Y;
        this.Panel = Panel;
        this.setIcon(new ImageIcon(filename));
    }

    public void setImage(URL filename)
    {
        this.setIcon(new ImageIcon(filename));
    }

    public abstract void clicked();


}

