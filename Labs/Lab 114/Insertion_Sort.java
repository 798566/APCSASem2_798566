
/**
 * Write a description of class Insertion_Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Insertion_Sort
{
    int arr[];
    public void sort(int arr[]){
        long time = System.nanoTime();
        int compareNums = 0;
        int swapNums = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                compareNums++;
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
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

    public void printArr(int arr[]){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
