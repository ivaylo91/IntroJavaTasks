package intro.java.tasks.arrays;

/**
 * @author Ivaylo Penev on 10/31/16.
 */
public class Demo {

    public static void main(String[] args) {

        ArraysFunctions arr = new ArraysFunctions();

        System.out.println("Minimal element of array:" + arr.getMinElement(new int[]{45, 15, 18, 34, 8, 22, 17}));

        System.out.println("Sum of elements of array is:" + arr.sumOfArraysElements(new int[]{45, 15, 18, 34, 8, 22, 17}));


    }
}
