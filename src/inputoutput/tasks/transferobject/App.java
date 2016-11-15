package inputoutput.tasks.transferobject;

import java.io.*;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class App {

    public static void main(String[] args) {

        try {

            TransferObject transfer = new TransferObject();

            System.out.println("Successful transfer " + transfer.copyStream("file.txt", "file1.txt", 100, 50) + " bytes");

        } catch (IOException ex) {

            System.out.println("Transfer is not successful.");
        }
    }
}
