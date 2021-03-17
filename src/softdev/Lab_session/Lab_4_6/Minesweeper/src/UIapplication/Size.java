package softdev.Lab_session.Lab_4_6.Minesweeper.UIapplication;

public class Size {
    private int column;
    private int raw;

    public Size(int column, int raw) {
        this.column = column;
        this.raw = raw;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRaw() {
        return raw;
    }

    public void setRaw(int raw) {
        this.raw = raw;
    }
}
