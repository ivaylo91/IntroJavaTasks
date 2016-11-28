package collections.PageBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ipenev91@gmail.com (Ivaylo Penev)
 */
public class App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>() {{
            add("Gosho");
            add("Pesho");
            add("Mitko");
            add("Ginka");
            add("Minka");
            add("Lubopitka");
        }};

        PageBean page = new PageBean(2, list);

        Scanner input = new Scanner(System.in);

        String userInput;
        while (!(userInput = input.nextLine()).equals("exit")) {
            if (userInput.equalsIgnoreCase("next")) {

                System.out.println(page.next());
            } else if (userInput.equalsIgnoreCase("previous")) {

                System.out.println(page.previous());
            }
        }
    }
}
