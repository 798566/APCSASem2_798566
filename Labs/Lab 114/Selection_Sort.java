
/**
 * Write a description of class Selection_Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Selection_Sort
{
    int arr[];
    public void sort(int arr[]){
        int compareNums = 0;
        int swapNums = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = arr[i];
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                compareNums++;
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    smallestIndex = j;
                }
            }
            int original = arr[i];
            arr[i] = smallest;
            arr[smallestIndex] = original;
            swapNums++;
        }
        printArr(arr);
        System.out.println("comparisons = " + compareNums);
        System.out.println("swaps = " + swapNums);
    }

    public void printArr(int arr[]){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
