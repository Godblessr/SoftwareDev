package be.kuleuven.groept.softdev.part8.demoen;

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

    @Override
    public void move() {
        System.out.println("Sailing...");
    }
}
