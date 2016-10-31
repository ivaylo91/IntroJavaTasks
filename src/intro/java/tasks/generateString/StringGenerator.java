package intro.java.tasks.generateString;

import java.util.Random;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class StringGenerator {

    final String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    Random rnd = new Random();

    public String generate(int len) {
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append(symbols.charAt(rnd.nextInt(symbols.length())));
        }

        return sb.toString();
    }
}
