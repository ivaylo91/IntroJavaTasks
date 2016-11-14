package inputoutput.tasks.filewriter;

import java.io.*;

/**
 * @author Ivaylo Penev on 11/14/16.
 */
public class FileContentWriter {

    private BufferedReader br;
    private BufferedWriter bw;
    private String symbol;
    private String line = " ";

    public String writeContentToFile(String filename, String symbol) throws IOException {

        File dest = new File(filename);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fw = new FileWriter(dest);

        do {
            line = br.readLine();

            if (!line.equalsIgnoreCase(symbol)) {

                fw.write(line + "\n");
            }

        } while (!line.equalsIgnoreCase(symbol));

        br.close();

        fw.close();

        return line;
    }
}
