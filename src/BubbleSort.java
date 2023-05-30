public class BubbleSort {
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped; //to give if swapped
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {


                    temp = arr[j];
                    arr[j] = arr[j + 1]; //to swap arr[j] and arr[j+1]
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

        }
    }
}