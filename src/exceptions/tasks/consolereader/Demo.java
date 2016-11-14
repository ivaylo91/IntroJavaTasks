package exceptions.tasks.consolereader;

import java.util.*;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com).
 */
public class Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ConsoleReader consoleReader = new ConsoleReader();

        int number = input.nextInt();

        int startInterval = input.nextInt();

        int endInterval = input.nextInt();

        try {
            consoleReader.checkIntervalFrom0To100(number, startInterval, endInterval);

        } catch (OutOfIntervalException ex) {

            System.out.printf("Number is out of interval %d to %d.", startInterval, endInterval);
        }
    }
}
