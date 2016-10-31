package intro.java.tasks.math;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 10/31/16.
 */
public class Demo {
    public static void main(String[] args) {

        Math math = new Math();

        System.out.println("Greatest common divider of two numbers is:" + math.greatestCommonDivider(2, 4));

        System.out.println("Least common divder of two numbers is:" + math.leastCommonDivider(4, 8));


    }
}
