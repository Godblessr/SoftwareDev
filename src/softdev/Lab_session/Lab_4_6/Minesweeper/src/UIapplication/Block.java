package softdev.Lab_session.Lab_4_6.Minesweeper.UIapplication;

public class Block {
    public int[][] Position;
    public boolean Musk = false;
    public boolean Mine = false;

    public Block(int[][] Position) {
        this.Position = Position;
    }

    public Block(int[][] Position, boolean Musk) {
        this.Position = Position;
    }

    public Block(int[][] Position, boolean Musk, boolean Mine) {
        this.Position = Position;
        this.Musk = Musk;
        this.Mine = Mine;
    }

    public int[][] getPosition() {
        return Position;
    }

    public void setPosition(int[][] position) {
        Position = position;
    }

    public boolean isMusk() {
        return Musk;
    }

    public void setMusk(boolean musk) {
        Musk = musk;
    }

    public boolean isMine() {
        return Mine;
    }

    public void setMine(boolean mine) {
        Mine = mine;
    }
}

