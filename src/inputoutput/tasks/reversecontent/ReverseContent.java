package inputoutput.tasks.reversecontent;

import java.util.*;
import java.io.*;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class ReverseContent {

    private Scanner in;
    private PrintWriter out;
    private StringBuffer sb;
    private String line;

    public String reverse(String filename) throws IOException {

        File source = new File(filename);

        File destination = new File(filename);

        in = new Scanner(source);

        sb = new StringBuffer();

        while (in.hasNextLine()) {

            line = in.nextLine();

            sb.append(line);
        }

        in.close();

        sb.reverse();

        out = new PrintWriter(destination);

        out.write(sb.toString());

        out.close();

        return sb.toString();
    }
}
