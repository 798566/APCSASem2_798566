import java.util.ArrayList;
/**
 * Write a description of class Cell here.
 *
 * @Sophia
 * @version 0415
 */
public class Cell
{
    private boolean occupied;
    private int id;
    private ArrayList<Cell> neighbors = new ArrayList<Cell>();
    
    static int idCounter = 1;

    public Cell() {
        occupied = false;
        id = idCounter++;
    }

    boolean getOccupied() {
        return occupied;
    }
    
    void setOccupied(boolean newOccupied) {
        occupied = newOccupied;
    }
    
    public void loadNeighbors() {
        // how do I determine who are my neighbors if I'm at one cell, do I need to go up to the array?
    }
}
