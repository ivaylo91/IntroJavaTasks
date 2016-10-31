package intro.java.tasks.arrays;

import java.util.Arrays;

/**
 * Created by ivaylo on 10/31/16.
 */
public class ArraysFunctions {

    private int minElement;
    private int sum;

    public int getMinElement(int[] arr) {

        Arrays.sort(arr);

        minElement = arr[0];

        return minElement;
    }

    public int sumOfArraysElements(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        return sum;
    }

    public int printElements(int arr[]) {

        for (int i = 0; i <= arr.length; i++) {

        }
    }
}
