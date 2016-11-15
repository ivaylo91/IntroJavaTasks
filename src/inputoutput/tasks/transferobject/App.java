package inputoutput.tasks.transferobject;

import java.io.*;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class App {

    public static void main(String[] args) {

        File source = new File("file.txt");
        File dest = new File("file1.txt");

        TransferObject transfer = new TransferObject();

        try {
            InputStream in = new FileInputStream(source);

            OutputStream out = new FileOutputStream(dest);

            transfer.copyStream(in, out, 100, 50);

        } catch (IOException ex) {

            System.out.println("Transfer is not successful.");
        }
    }
}
