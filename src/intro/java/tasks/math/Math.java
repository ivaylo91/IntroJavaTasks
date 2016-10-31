package intro.java.tasks.math;

import java.math.BigInteger;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 10/31/16.
 */
public class Math {
    /**
     * @param a - first number
     * @param b - second number
     * @return greatest common divider of two numbers
     */
    public int greatestCommonDivider(int a, int b) {

        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);

        BigInteger gcd = b1.gcd(b2);

        return gcd.intValue();  // return greatest common divider
    }

    public int leastCommonDivider(int a, int b) {

        return a * (b / greatestCommonDivider(a, b));
    }
}
