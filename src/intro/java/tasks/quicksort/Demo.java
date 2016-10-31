package intro.java.tasks.quicksort;

import java.util.Arrays;

/**
 * Created by ivaylo on 10/31/16.
 */
public class Demo {
    public static void main(String[] args) {

        int[] arr = new int[]{45, 15, 18, 34, 8, 22, 17};

        System.out.println("Before quick sort:" + Arrays.toString(arr));

        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("After quick sort:" + Arrays.toString(arr));
    }
}
