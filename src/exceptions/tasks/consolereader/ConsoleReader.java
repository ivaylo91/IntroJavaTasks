package exceptions.tasks.consolereader;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class ConsoleReader {

    public void checkIntervalFrom0To100(int input, int startInterval, int endInterval) throws OutOfIntervalException {

        if (input < startInterval || input > endInterval) {

            throw new OutOfIntervalException();

        } else {

            System.out.printf("Number is in interval %d to %d", startInterval, endInterval);
        }
    }
}
