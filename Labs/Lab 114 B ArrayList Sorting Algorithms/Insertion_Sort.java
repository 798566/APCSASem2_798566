import java.util.ArrayList;
/**
 * Write a description of class Insertion_Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Insertion_Sort
{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void sort(ArrayList<Integer> arr){
        long time = System.nanoTime();
        int compareNums = 0;
        int swapNums = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j > 0; j--) {
                compareNums++;
                if (arr.get(j) < arr.get(j-1)) {
                    int temp = arr.get(j);
                    arr.set(j, j-1);
                    arr.set(j-1, temp);
                    swapNums++;
                }
            }
        }
        time = System.nanoTime() - time;
        
        printArr(arr);
        System.out.println("comparisons = " + compareNums);
        System.out.println("swaps = " + swapNums);
        System.out.println("time in nanoseconds = " + time);
    }

    public void printArr(ArrayList<Integer> arr){
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
        System.out.println();
    }
}
