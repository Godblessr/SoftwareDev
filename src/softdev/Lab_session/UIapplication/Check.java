package UIapplication;

public class Check {
    private GamePanel Panel;
    private int Row;
    private int Column;

    private static final int[] distantX = {-1, 0, 1};
    private static final int[] distantY = {-1, 0, 1};

    public Check(GamePanel Panel) {
        this.Panel = Panel;
        Row = (Panel.getHeight() - 20) / 20;
        Column = (Panel.getWidth() - 20) / 20;

    }

    private boolean hasKickedBoundary(int x, int y)
    {
        return x < 0 || x >= Column || y < 0 || y >= Row;
    }

    protected boolean isSuccess()
    {
        // Ensure count start at 0 once this method is invoked.
        int count = 0;

        for (int y = 0; y < Row; y++)
        {
            for (int x = 0; x < Column; x++)
            {
                if (((ControlBlock) Panel.getSquareAt(x, y)).getIsChecked())
                    count++;
            }
        }

        return count == Row * Column;
    }

    protected void showBomb(int currentX, int currentY)
    {
        for (int y = 0; y < Row; y++)
        {
            for (int x = 0; x < Column; x++)
            {
                if (currentX == x && currentY == y){}
                else if (((ControlBlock) Panel.getSquareAt(x, y)).getIsMine())
                    Panel.getSquareAt(x, y).setImage(Check.class.getResource("/bomb.png"));
                else if(((ControlBlock) Panel.getSquareAt(x, y)).getIsFlaged())
                    Panel.getSquareAt(x, y).setImage(Check.class.getResource("/flagWrong.png")); // Wrong guess!
            }
        }
    }

    protected void countBomb(int currentX, int currentY)
    {
        // Ensure count start at 0 once this method is invoked.
        int count = 0;
        ControlBlock currentObject;

        if (hasKickedBoundary(currentX, currentY))
            return; //Skip iteration.
        else if(((ControlBlock)Panel.getSquareAt(currentX, currentY)).getIsChecked())
            return; //Skip iteration.
        else {
            // Declare a ControlBlock instance.
            ControlBlock squareObject;

            // Get the current square.
            currentObject = (ControlBlock)Panel.getSquareAt(currentX, currentY);
            currentObject.setChecked(true);

            /*
             * Check surrounding 8 squares:
             * If the square has touch the boundary, skip to next iteration of the loop.
             * Else if the square is itself, then it's unnecessary to count. Just skip to next iteration of the loop.
             * Else check whether this surrounding square contains a bomb. If it does, count accumulation.
             */
            for (int x : distantX)
            {
                for (int y: distantY)
                {
                    if (hasKickedBoundary(currentX + x, currentY + y)){}
                    else if (x == 0 && y == 0){}
                    else{
                        squareObject = (ControlBlock)Panel.getSquareAt(currentX + x, currentY + y);
                        count = squareObject.getIsMine() ? count + 1 : count;
                    }
                }
            }
        }

        /*
         * If count result is zero, then replace this square with its surrounding
         * squares and invoke itself to find the bombs again.
         */
        if (count != 0)
            currentObject.setImage(Check.class.getResource( "/" + count + ".png"));
        else {
            // Paint current square as blank.
            currentObject.setImage(Check.class.getResource("/0.png"));
            countBomb(currentX - 1, currentY -1); // Upper left
            countBomb(currentX, currentY -1); // Above
            countBomb(currentX + 1, currentY -1); // Upper right
            countBomb(currentX - 1, currentY); // Left side
            countBomb(currentX + 1, currentY); // Right side
            countBomb(currentX - 1, currentY + 1); // Lower left
            countBomb(currentX, currentY + 1); // Below
            countBomb(currentX + 1, currentY + 1); // Lower right
        }
    }
    public void generateMine(){

    }
}
