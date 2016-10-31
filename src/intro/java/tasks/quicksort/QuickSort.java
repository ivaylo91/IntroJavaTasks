package intro.java.tasks.quicksort;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 10/31/16.
 */
public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {

        if ((arr == null) || (arr.length == 0)) {
            return;
        }
        if (low >= high) {
            return;
        }

        //pick pivot element

        int middle = low + (high - low) / 2;

        int pivot = arr[middle];

        //make left < pivot and right > pivot
        int i = low;

        int j = high;

        while (i <= j) {

            while (arr[i] < pivot) {

                i++;
            }
            while (arr[j] > pivot) {

                j--;
            }

            if (i <= j) {

                int temp = arr[i];

                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j) {

            quickSort(arr, low, j);
        }
        if (high > i) {

            quickSort(arr, i, high);
        }
    }
}
