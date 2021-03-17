package softdev.Lab_session.Lab_4_6.Minesweeper.UIapplication;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private int rows;
    private int cols;
    private int NrOfMine;
    private final int BLOCKWIDTH = 20;
    private final int BLOCKHEIGHT = 20;
    private JLabel[][] labels;
    private MyButton[][] buttons;

    /*
     * create "GamePanel" panel
     */
    public GamePanel(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.NrOfMine = rows * cols / 10;
        this.labels = new JLabel[rows][cols];
        this.buttons = new MyButton[rows][cols];
        this.setLayout(null);
//        this.initButtons();
        this.initLabels();
    }


    private void initLabels() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                JLabel l = new JLabel("", JLabel.CENTER);
                // 设置每个小方格的边界
                l.setBounds(j * BLOCKWIDTH, i * BLOCKHEIGHT, BLOCKWIDTH, BLOCKHEIGHT);
                // 绘制方格边框
                l.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                // 设置方格为透明,便于我们填充颜色
                l.setOpaque(true);
                // 背景填充为黄色
                l.setBackground(Color.YELLOW);
                // 将方格加入到容器中(即面板JPanel)
                this.add(l);
                // 将方格存到类变量中,方便公用
                labels[i][j] = l;
            }
        }
//        randomBomb();
//        writeNumber();

    }

}
