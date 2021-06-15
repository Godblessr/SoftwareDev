package softdev.Part8_refactoring_and_clean_code.part8en.original;

public class SailingBoat extends Boat {
    private int nrOfSails;

    public SailingBoat(String name, int nrOfSails) {
        super(name);
        this.nrOfSails = nrOfSails;
    }

    public int getNrOfSails() {
        return nrOfSails;
    }

    public void setNrOfSails(int nrOfSails) {
        this.nrOfSails = nrOfSails;
    }

    public void sail() {
        System.out.println("Sailing...");
    }
}
