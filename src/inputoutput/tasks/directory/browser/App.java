package inputoutput.tasks.directory.browser;

import java.io.FileNotFoundException;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "/home/ivaylo/";

        DirectoryBrowser directoryBrowser = new DirectoryBrowser();

        for(Directory fo : directoryBrowser.checkIsFileOrDirectory(path)){

            if(fo.isFile()){
                System.out.println("File:" + fo.getName());
            }
            if(fo.isDirectory()){
                System.out.println("Directory:" + fo.getName());
            }
        }
    }
}
