package intro.java.tasks.reversearray;

/**
 * @author Ivaylo Penev (ipenev91@gmail.com)
 */
public class ReverseArray {


    public int[] reverse_arr(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] = arr[arr.length - i - 1];

            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
