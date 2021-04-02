package GameRun;

import UIapplication.MineView;

/**
 * @author Zeren Jiang
 */
public class Run {

    /**
     * Run the game
     */
    public static void main(String[] args) {
        {
            new MineView("Mine sweeper");

/*            final View frame = new View("Mine sweeper");

            frame.pack();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = frame.getSize();
            if (frameSize.height > screenSize.height)
                frameSize.height = screenSize.height;
            if (frameSize.width > screenSize.width)
                frameSize.width = screenSize.width;
            frame.setLocation((screenSize.width - frameSize.width) / 2,
                    (screenSize.height - frameSize.height) / 2);
            frame.setVisible(true);*/
        }
    }
}
