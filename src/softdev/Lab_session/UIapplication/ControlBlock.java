package UIapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControlBlock extends Block implements MouseListener {
    private boolean IsMine = false;
    private boolean IsChecked = false;
    private boolean IsFlagged = false;
    private final int X;
    private final int Y;

    public ControlBlock(GamePanel Panel, int x, int y) {
        super(x, y, ControlBlock.class.getResource("/10.png"), Panel);
        X = x;
        Y = y;
        addMouseListener(this);
    }

    /*
     * Add getter and setter of Mine attribution
     */
    protected boolean getIsMine() {
        return IsMine;
    }

    protected void setMine(boolean mine) {
        IsMine = mine;
    }

    protected boolean getIsChecked() {
        return IsChecked;
    }

    protected void setChecked(boolean checked) {
        IsChecked = checked;
    }

    public boolean getIsFlaged() {
        return IsFlagged;
    }

    public void setFlagged(boolean flagged) {
        IsFlagged = flagged;
    }

    public void clicked() {
        Check check = new Check(Panel);
        IsFlagged = false;
        if (IsMine) {
            setImage(ControlBlock.class.getResource("/bombReveal.png"));
            check.showBomb(X, Y);
            window("Do you want to try again?", "Game Over",
                    new ImageIcon(ControlBlock.class.getResource("/failFace.png")));
        } else {
            IsChecked = false;
            /*
             * If this square doesn't contain a bomb, calculate its surrounding bombs.
             * If this square has zero bombs in its surrounding squares,
             * expanding into empty space until the surrounding of the space has at least one bomb
             * or the space touches the window's boundary.
             */
            check.countBomb(X, Y);

            if (check.isSuccess()) {
                check.showBomb(X, Y);
                window("You win this game! Do you want to try again?", "Congratulations",
                        new ImageIcon(ControlBlock.class.getResource("/passFace.jpg")));
            }
        }
    }

    public void window(String msg, String title, Icon img) {

        int choose = JOptionPane.showConfirmDialog(Panel, msg, title,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, img);

        if (choose == JOptionPane.YES_OPTION) {
            new MineView("Minesweeper");
        }

//        // Close this window after user making a choice
//        java.awt.Panel.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // If user right-click on this square.
        if (e.getButton() == MouseEvent.BUTTON3) {
            int clickCount = e.getClickCount();

            // Show red flag.
            if (clickCount == 1) {
                setImage(ControlBlock.class.getResource("/redFlag.png"));
                IsFlagged = true;
            }

            // Show question mark.
            if (clickCount == 2) {
                setImage(ControlBlock.class.getResource("/questionMark.png"));
                IsFlagged = false;
            }
        }
    }

    // The following mouse events are not going to be handled in this class.
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
