
/**
 * Selection Sort sorting algorithm
 *
 * @author Sophia
 * @version 0110
 */
public class Selection_Sort
{
    int arr[];
    public void sort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = arr[i];
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    smallestIndex = j;
                }
            }
            int original = arr[i];
            arr[i] = smallest;
            arr[smallestIndex] = original;
        }
        printArr(arr);
    }

    public void printArr(int arr[]){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
