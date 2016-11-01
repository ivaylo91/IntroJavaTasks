package objects.tasks.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 11/1/16.
 */
public class Sumator {

    public int sum(Integer a, Integer b) {

        return a + b;
    }

    public Double sum(Double a, Double b) {

        return a + b;
    }

    public Integer sum(String a, String b) {

        int num1 = Integer.valueOf(a);
        int num2 = Integer.valueOf(b);


        return num1 + num2;
    }

    public BigInteger sum(BigInteger a, BigInteger b) {

        return a.add(b);
    }

    public BigDecimal sum(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
