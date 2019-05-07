import java.util.ArrayList;
/**
 * Write a description of class N4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class N4
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> a1;
    private ArrayList<Integer> a2;
    private ArrayList<Integer> a3;

    public N4()
    {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public ArrayList<Integer> findIntersection(int[]a1, int[]a2, int[] a3)
    {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for (int i = 0; i < a1.length; i++){
            int first = a1[i];
            if (a2.indexOf(first) && a3.contains(first)){
                intersection.add(first);
            }
        }
        return intersection;
    }
}
