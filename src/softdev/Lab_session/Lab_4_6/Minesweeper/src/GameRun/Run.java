package src.GameRun;

import softdev.Lab_session.Lab_4_6.Minesweeper.UIapplication.GamePanel;
import softdev.Lab_session.Lab_4_6.Minesweeper.UIapplication.MineView;

import java.awt.*;

/**
 * @author Zeren Jiang
 */
public class Run {

    /**
     * Run the game
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MineView frame = new MineView();
                    GamePanel mainPanel = new GamePanel(20, 30);
                    Container c = frame.getContentPane();
                    c.add(mainPanel);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
