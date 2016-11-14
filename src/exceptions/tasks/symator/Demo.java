package exceptions.tasks.symator;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.IllegalFormatException;
import java.util.Scanner;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com).
 */
public class Demo {

    public static void main(String[] args) {

        Sumator sumator = new Sumator();

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        try {
            System.out.println(sumator.sumTwoIntegers(a, b));
        } catch (NumberFormatException ex) {

            System.out.println("Invalid input,please input two Integer values.");
        }
    }
}
