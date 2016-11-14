package inputoutput.tasks.filewriter;

import java.io.*;

/**
 * @author Ivaylo Penev on 11/14/16.
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        FileContentWriter fileContentWriter = new FileContentWriter();

        fileContentWriter.writeContentToFile("file.txt", "!");
    }
}
