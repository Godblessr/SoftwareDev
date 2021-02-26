package softdev.Lab_session.Lab_3.Stack_Brackettester.view.swing;

import java.awt.*;

/**
 * @author Jeroen Van Aken
 */
public class Run {

    /**
     * Launch the softdev.Lab_session.Lab_3.Stack_Brackettester.application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    BracketsView frame = new BracketsView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
