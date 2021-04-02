package UIapplication;

import java.util.Random;

public class generateMine extends Size {

    public generateMine(GamePanel Panel, int number) {

        super(Panel);

        int count = 0;

        do {
            regenerateMine();
            count++;
        } while (count < number);
    }

    /**
     * This method produce bombs on random square. If the assigned square has already contained a bomb, then
     * reassign a square to receive this bomb by invoking itself.
     */
    public void regenerateMine() {
        Random r = new Random();

        int X = r.nextInt(Column);
        int Y = r.nextInt(Row);

        ControlBlock square = (ControlBlock) Panel.getSquareAt(X, Y);

        if (!square.getIsMine()) {
            // mark this square as it has a bomb and been traversed.
            square.setMine(true);
            square.setChecked(true);
        } else {
            regenerateMine();
        }
    }


}