
/**
 * Write a description of class GridTester here.
 *
 * @Sophia
 * @version 0415
 */
public class GridTester
{
    private Cell[][] cells;

    public GridTester(int rows, int cols) {
        Cell[][] cells = new Cell[rows][cols];
    }

    public void loadOccupied() {
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                int percent = (int) Math.random()*10 + 1;
                if (percent == 1 || percent == 2 || percent == 3) {
                    cells[row][col].setOccupied(true);
                }
                else {
                    cells[row][col].setOccupied(false);
                }

            }
        }
    }
}
