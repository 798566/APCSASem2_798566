
/**
 * Write a description of class My_Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class My_Sort
{
    int arr[];
    public void sort(int arr[]){
        int compareNums = 0;
        int swapNums = 0;
        for (int i = arr.length; i > 1; i--) {
            for (int j = 0; j < arr.length-1; j++) {
                compareNums ++;
                if (arr[j] > arr[j+1]) {
                    // swaps to put smaller value in lower index
                    int greater = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = greater;
                    swapNums ++;
                }
            }
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
