package inputoutput.tasks.transferobject;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import jdk.nashorn.internal.parser.Scanner;

import java.io.*;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class TransferObject {

    public int copyStream(String sourceFile, String destinationFile, int limit, int offset) throws IOException {

        int counter = 0;

        File read = new File(sourceFile);

        File write = new File(destinationFile);

        InputStream in = new FileInputStream(read);

        OutputStream out = new FileOutputStream(write);

        in.skip(offset);

        int readBytes;

        while ((readBytes = in.read()) != -1 && counter < limit) {

            out.write(readBytes);

            counter++;
        }

        in.close();

        out.close();

        return counter;
    }
}
