import java.util.ArrayList;
/**
 * Number 1
 *
 * @Sophia
 * @version 042519
 */
public class N1
{
    private ArrayList<Integer> arr1;

    public N1()
    {
        arr1 = new ArrayList(100);
        for (int i = 0; i < arr1.size(); i++) {
            arr1.set(i, i+1);
        }
        arr1.set((int)(Math.random()*100), 0);
    }

    public Integer findMissing(ArrayList<Integer> arr1)
    {
        arr1 = sort(arr1);
        for (int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) != i) {
                return i;
            }
        }
    }
}
