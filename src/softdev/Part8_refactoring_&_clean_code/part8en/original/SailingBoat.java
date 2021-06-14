package be.kuleuven.groept.softdev.part8.original;

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
