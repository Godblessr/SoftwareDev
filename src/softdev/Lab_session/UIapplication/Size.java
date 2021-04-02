package UIapplication;

public  abstract class Size {
    protected int Column;
    protected int Row;
    protected GamePanel Panel;

    public Size(GamePanel Panel) {
        this.Panel = Panel;
        Row = (Panel.getHeight() - 20) / 20;
        Column = (Panel.getWidth() - 20) / 20;
    }

    protected abstract void regenerateMine();
}
