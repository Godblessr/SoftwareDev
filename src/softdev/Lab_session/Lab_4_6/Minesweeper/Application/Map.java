package softdev.Lab_session.Lab_4_6.Minesweeper.Application;

import java.util.ArrayList;

public class Map {
    private String Mode;
    private int nrOfMine;
    protected ArrayList<Block> BlockChain;//store Block


    public Map(String mode) {
        Mode = mode;
    }

    public int getNrOfMine() {
        return nrOfMine;
    }

    public void setNrOfMine(int nrOfMine) {
        this.nrOfMine = nrOfMine;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }

    public void addBlock(Block block) {
        BlockChain.add(block);
    }
}
