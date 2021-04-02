package UIapplication;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MineView extends JFrame implements ActionListener {

    private JPanel GamePanel;
    private JMenuBar menuBar;
    private final JMenuItem mniNewGame;
    private final JMenuItem mniExit;
    private final JMenuItem mniAbout;
    private final JRadioButtonMenuItem rbmniBeginner;
    private final JRadioButtonMenuItem rbmniIntermediate;
    private final JRadioButtonMenuItem rbmniExpert;
    private final JMenu mnGame;
    private final JMenu mnHelp;


    /**
     * Create the frame.
     * @param mine_sweeper
     */
    public MineView(String mine_sweeper) {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 1450, 1300);
        this.setTitle("Minesweeper");
        this.setLocationRelativeTo(null);
        /*
         * add a menu
         */
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        mnGame = new JMenu("Game(G)");
        mnHelp = new JMenu("Help(H)");
        menuBar.add(mnGame);
        menuBar.add(mnHelp);
        mnGame.setMnemonic('G');
        mnHelp.setMnemonic('H');
        /*
         * create "Game" menu
         */
        mniNewGame = new JMenuItem("New Game");
        mniExit = new JMenuItem("Exit");
        mniExit.setEnabled(true);
        mniNewGame.setEnabled(true);
        rbmniBeginner = new JRadioButtonMenuItem("Beginner(8*8,Mine:10)");
        rbmniIntermediate = new JRadioButtonMenuItem("Intermediate(16*16,Mine:40)");
        rbmniExpert = new JRadioButtonMenuItem("Expert(16*30,Mine:99)");

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

        /*
         * create "Help" menu
         */
        mniAbout = new JMenuItem("About");

        /*
         * addActionListener
         */
        rbmniBeginner.addActionListener(this);
        rbmniIntermediate.addActionListener(this);
        rbmniExpert.addActionListener(this);
        mniNewGame.addActionListener(this);
        mniExit.addActionListener(this);
        mnHelp.add(mniAbout);
        mniAbout.addActionListener(this);
        /*
         * Initialize
         */
        rbmniBeginner.setSelected(true);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        int column = 0;
        int row = 0;
        int mine = 0;
        boolean errorFlag = false;
        if (rbmniBeginner.isSelected()) {
            column = 10;
            row = 10;
            mine = 10;

        } else if (rbmniIntermediate.isSelected()) {
            column = 16;
            row = 16;
            mine = 40;
        } else if (rbmniExpert.isSelected()) {
            column = 30;
            row = 25;
            mine = 100;
        }

        if (e.getSource() == mniNewGame) {
            if (rbmniBeginner.isSelected()) {
                column = 10;
                row = 10;
                mine = 10;
            } else if (rbmniIntermediate.isSelected()) {
                column = 16;
                row = 16;
                mine = 40;
            } else if (rbmniExpert.isSelected()) {
                column = 30;
                row = 25;
                mine = 100;
            }
        }

        if (e.getSource() == mniExit) {
            System.exit(0);
        }

        if (e.getSource() == mniAbout) {
            JOptionPane.showMessageDialog(this, "Author:Zeren Jiang", "About",
                    JOptionPane.INFORMATION_MESSAGE);
        }

//        GamePanel b = new GamePanel(column, row);
//        new generateMine(b, mine);
        if(!errorFlag)
        {
            setLayout(new BorderLayout());
            GamePanel b = new GamePanel(column, row);
            add(b,BorderLayout.CENTER);
            new generateMine(b, mine);
        }
    }

}



