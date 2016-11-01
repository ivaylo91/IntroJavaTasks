package objects.tasks.sumator;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 11/1/16.
 */
public class Demo {

    public static void main(String[] args) {

        Sumator sumator = new Sumator();

        //Sum two integers

        System.out.println("Sum of Integer numbers:" + sumator.sum(1, 2));
        System.out.println("Sum of Double numbers:" + sumator.sum(2.0, 3.0));
        System.out.println("Sum of String numbers:" + sumator.sum("3", "7"));
        System.out.println("Sum of BigDecimal numbers:" + sumator.sum(20000, 3000));
        System.out.println("Sum of BigInteger numbers:" + sumator.sum(3000.40, 400.23));
    }
}
