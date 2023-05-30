//to use call QuickSort(...)- main driver not included because instructions didn't seem to call for it???
public class QuickSort {
    static void swap(int arr[], int i, int j) {
        int temporary = arr[i];
        arr[i] = arr[j];
        arr[j] = temporary;
    }
    int partition(int arr[], int low, int high) { //partitioning is to place the current element in the correct position
        int pivot = arr[high]; //pivot is to check against
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) { //if current element is <= to pivot, swap the current arr[j] with the element at index i and increment i
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}