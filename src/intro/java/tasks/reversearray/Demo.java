package intro.java.tasks.reversearray;

import java.util.Arrays;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 10/31/16.
 */
public class Demo {
    public static void main(String[] args) {

        ReverseArray array = new ReverseArray();

        System.out.println(Arrays.toString(array.reverse_arr(new int[]{10, 15, 20, 30, 34, 45, 50})));
    }
}
