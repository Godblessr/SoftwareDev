package softdev.Part8_refactoring_and_clean_code.part8en.demoen;

public class RowingBoat extends Boat {
    private int nrOfPeddles;

    public RowingBoat(String name, int nrOfPeddles) {
        super(name);
        this.nrOfPeddles = nrOfPeddles;
    }

    public int getNrOfPeddles() {
        return nrOfPeddles;
    }

    public void setNrOfPeddles(int nrOfPeddles) {
        this.nrOfPeddles = nrOfPeddles;
    }

    @Override
    public void move() {
        System.out.println("Rowing...");
    }
}
