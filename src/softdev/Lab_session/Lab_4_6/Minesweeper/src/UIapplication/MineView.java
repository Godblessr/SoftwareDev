package softdev.Lab_session.Lab_4_6.Minesweeper.UIapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class MineView extends JFrame {

    private JPanel GamePanel;
    private JTextField inputField;
    private JLabel lblAccepted;

    /**
     * Create the frame.
     */
    public MineView() {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 1450, 1300);
        this.setTitle("Minesweeper");
        this.setLocationRelativeTo(null);
        /*
         * add a menu
         */
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu mnGame = new JMenu("Game");
        JMenu mnHelp = new JMenu("Help");
        menuBar.add(mnGame);
        menuBar.add(mnHelp);
        mnGame.setMnemonic('G');
        mnHelp.setMnemonic('H');
        /*
         * create "Game" menu
         */
        JMenuItem mniNewGame = new JMenuItem("New Game");
        JMenuItem mniExit = new JMenuItem("Exit");
        mniExit.setEnabled(true);
        mniNewGame.setEnabled(true);
        JRadioButtonMenuItem rbmniBeginner = new JRadioButtonMenuItem("Beginner(8*8,Mine:10)");
        JRadioButtonMenuItem rbmniIntermediate = new JRadioButtonMenuItem("Intermediate(16*16,Mine:40)");
        JRadioButtonMenuItem rbmniExpert = new JRadioButtonMenuItem("Expert(16*30,Mine:99)");

        mnGame.add(mniNewGame);
        mnGame.addSeparator();
        mnGame.add(rbmniBeginner);
        mnGame.add(rbmniIntermediate);
        mnGame.add(rbmniExpert);
        mnGame.addSeparator();
        mnGame.add(mniExit);

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(rbmniBeginner);
        btnGroup.add(rbmniIntermediate);
        btnGroup.add(rbmniExpert);
        rbmniBeginner.setSelected(true);

        /*
         *    rbmniBeginner.addChangeListener(new ChangeListener() {
         *          @Override
         *         public void stateChanged(ChangeEvent e) {
         *            System.out.println("Beginner:" + rbmniBeginner.isSelected());
         *        }
         *    });
         *
         *    rbmniIntermediate.addChangeListener(new ChangeListener() {
         *        @Override
         *         public void stateChanged(ChangeEvent e) {
         *             System.out.println("Intermediate:" + rbmniIntermediate.isSelected());
         *         }
         *     });
         *
         *     rbmniExpert.addChangeListener(new ChangeListener() {
         *        @Override
         *        public void stateChanged(ChangeEvent e) {
         *            System.out.println("Expert:" + rbmniExpert.isSelected());
         *         }
         *     });
         */


        /*
         * create "Help" menu
         */
        JMenuItem mniAbout = new JMenuItem("About");
        mniAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("About");
            }
        });
        mnHelp.add(mniAbout);
    }
}

