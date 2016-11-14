package exceptions.tasks.sumator;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com).
 */
public class Sumator {

    public Integer sumTwoIntegers(String a, String b) {

        int num1 = Integer.valueOf(a);
        int num2 = Integer.valueOf(b);

        return num1 + num2;
    }
}
