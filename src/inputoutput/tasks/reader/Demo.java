package inputoutput.tasks.reader;

import java.io.IOException;

/**
 * Created by ivaylo on 03.11.16.
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        ConsoleReader cr = new ConsoleReader();

        System.out.println("Read String:" + cr.readString());

        System.out.println("Read Float:" + cr.readFloat());

        System.out.println("Read Integer:" + cr.readInt());

        System.out.println("Read Char: " + cr.readChar());
    }
}
