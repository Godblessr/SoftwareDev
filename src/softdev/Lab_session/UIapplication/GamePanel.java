package UIapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private JPanel Panel = new JPanel();
    private int PanelWIDTH;
    private int PanelHEIGHT;
    private Block[][] buttons;
    /*
     * create "GamePanel" panel
     */
    public GamePanel(int WIDTH, int HEIGHT) {
        super();

        this.PanelHEIGHT = HEIGHT;
        this.PanelWIDTH = WIDTH;
        this.buttons = new Block[WIDTH][HEIGHT];

        setSize(20 + WIDTH * 20, 20 + HEIGHT * 20);

        Panel.setLayout(new GridLayout(PanelHEIGHT,PanelWIDTH));

        for (int y = 0; y < PanelHEIGHT; y++)
        {
            for (int x = 0; x < PanelWIDTH; x++)
            {
                buttons[x][y] = new ControlBlock(this,x, y);
                buttons[x][y].addActionListener(this);

                Panel.add(buttons[x][y]);
            }
        }
//        this.initLabels();
 setVisible(true);
    }


/*    private void initLabels() {
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

    }*/
    public Block getSquareAt(int x, int y)
    {
        if (x < 0 || x >= PanelWIDTH || y < 0 || y >= PanelHEIGHT)
            return null;

        return buttons[x][y];
    }
    public void actionPerformed(ActionEvent e) {
        // The button that has been pressed.
        Block b = (Block) e.getSource();
        b.clicked();
    }
}
