import java.util.ArrayList;
/**
 * Write a description of class My_Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class My_Sort
{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void sort(ArrayList<Integer> arr){
        long time = System.nanoTime();
        int compareNums = 0;
        int swapNums = 0;
        for (int i = arr.size(); i > 1; i--) {
            for (int j = 0; j < arr.size()-1; j++) {
                compareNums ++;
                if (arr.get(j) > arr.get(j+1)) {
                    // swaps to put smaller value in lower index
                    int greater = arr.get(j);
                    arr.set(j, j+1);
                    arr.set(j+1, greater);
                    swapNums ++;
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
