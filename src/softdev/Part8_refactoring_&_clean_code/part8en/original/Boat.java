package be.kuleuven.groept.softdev.part8.original;


import java.util.ArrayList;
import java.util.List;

public class Boat {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        List<Boat> boats = new ArrayList<>();
        boats.add(new RowingBoat("Marie Louise", 4));
        boats.add(new RowingBoat("Bertha", 2));
        boats.add(new SailingBoat("Anna", 2));
        for (Boat boat : boats) {
            if (boat instanceof RowingBoat) {
                ((RowingBoat) boat).row();
            } else if (boat instanceof SailingBoat) {
                ((SailingBoat) boat).sail();
            }
        }
    }
}
