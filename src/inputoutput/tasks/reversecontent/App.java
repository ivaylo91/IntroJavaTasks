package inputoutput.tasks.reversecontent;

import java.io.IOException;

/**
 * Created by ivaylo on 11/14/16.
 */
public class App {

    public static void main(String[] args) {

        try {
            ReverseContent reverseContent = new ReverseContent();

            reverseContent.reverse("file.txt");

        } catch (IOException ex) {

            System.out.println("Cannot reverse content");
        }
    }
}
