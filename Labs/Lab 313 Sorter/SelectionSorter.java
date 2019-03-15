
/**
 * Write a description of class SelectionSorter here.
 *
 * @author Sophia
 * @313
 */
public class SelectionSorter extends Sorter
{
    public SelectionSorter()
    {
        super();
    }

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
    }

    public void onePass1(int[] a, int initialLeftIndex, int limitRightIndex) {
        int pivotValue = a[initialLeftIndex];
        int rightIndex = limitRightIndex - 1;
        int leftIndex = initialLeftIndex + 1;
        for (int i = leftIndex; i < rightIndex; i++){
            for (pivotValue; pivtValue < )) {

                if (leftIndex < rightIndex) {
                    swap(a, leftIndex, rightIndex);
                    rightIndex--;
                    leftIndex++;
                }
            } else {
                leftIndex++;
            }
            if (initialLeftIndex < leftIndex - 1) {
                swap(a, initialLeftIndex, leftIndex - 1);
                onePass(a, initialLeftIndex, leftIndex - 1);
            }
            if (leftIndex < limitRightIndex) {
                onePass(a, leftIndex, limitRightIndex);
            }
        }
    }

    private void setPivot(int[] a, int initialLeftIndex, int limitRightIndex) {
        int elementCount = limitRightIndex - initialLeftIndex;
        int rightIndex = limitRightIndex - 1;
        if (elementCount >= 3) {
            int middleIndex = initialLeftIndex + elementCount/2;
            int leftValue = a[initialLeftIndex];
            int rightValue = a[rightIndex];
            int middleValue = a[middleIndex];
            if (less(a[rightIndex], a[middleIndex])) {
                if (less(a[initialLeftIndex], a[rightIndex])) {
                    swap(a, initialLeftIndex, rightIndex);
                }
            }
            if (less(a[initialLeftIndex], a[middleIndex])) {
                swap(a, initialLeftIndex, middleIndex);
            }
        }
    }

    public void onePass(int[] a, int initialLeftIndex, int limitRightIndex) {
        // By eliminating the smart pivot code, sorted arrays produce
        // worst case behavior
        // setPivot(a, initialLeftIndex, limitRightIndex);
        int pivotValue = a[initialLeftIndex];
        int rightIndex = limitRightIndex - 1;
        int leftIndex = initialLeftIndex + 1;
        while (leftIndex <= rightIndex) {
            while ((leftIndex <= rightIndex) && lessEqual(a[leftIndex], pivotValue)) {
                leftIndex++;
            }
            while ((leftIndex <= rightIndex) && less(pivotValue, a[rightIndex])) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                swap(a, leftIndex, rightIndex);
                rightIndex--;
                leftIndex++;
            }
        }
        if (initialLeftIndex < leftIndex - 1) {
            swap(a, initialLeftIndex, leftIndex - 1);
            onePass(a, initialLeftIndex, leftIndex - 1);
        }
        if (leftIndex < limitRightIndex) {
            onePass(a, leftIndex, limitRightIndex);
        }
    }

    public void sort(int[] a) {
        onePass(a, 0, a.length);
    }
}