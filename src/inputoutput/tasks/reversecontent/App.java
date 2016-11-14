package inputoutput.tasks.reversecontent;

import java.io.IOException;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
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
