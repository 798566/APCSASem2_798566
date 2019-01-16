import java.util.ArrayList;
/**
 * Write a description of class Selection_Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Selection_Sort
{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void sort(ArrayList<Integer> arr){
        int compareNums = 0;
        int swapNums = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int smallest = arr.get(i);
            int smallestIndex = i;
            for (int j = i + 1; j < arr.size(); j++) {
                compareNums++;
                if (arr.get(j) < smallest) {
                    smallest = arr.get(j);
                    smallestIndex = j;
                }
            }
            int original = arr.get(i);
            arr.set(i, smallest);
            arr.set(smallestIndex, original);
            swapNums++;
        }
        printArr(arr);
        System.out.println("comparisons = " + compareNums);
        System.out.println("swaps = " + swapNums);
    }

    public void printArr(ArrayList<Integer> arr){
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
        System.out.println();
    }
}
