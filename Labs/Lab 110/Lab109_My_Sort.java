
/**
 * Lab 109 write a pseudo code algorithm to sort an array of integers
 * them implement your code as a sorting algorithm
 *
 * @author Sophia
 * @version 0109
 */
public class Lab109_My_Sort
{
    int arr[];
    public void sort(int arr[]){
        for (int i = arr.length; i > 1; i--) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swaps to put smaller value in lower index
                    int greater = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = greater;
                }
            }
        }
        printArr(arr);
    }
    
    public void printArr(int arr[]){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}