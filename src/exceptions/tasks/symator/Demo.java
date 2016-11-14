package exceptions.tasks.symator;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.IllegalFormatException;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com).
 */
public class Demo {

    public static void main(String[] args) {

        Sumator sumator = new Sumator();

        try {
            System.out.println(sumator.sumTwoIntegers("2.34", "5.45"));
        } catch (NumberFormatException ex) {

            System.out.println("Invalid input,please try again");
        }
    }
}
