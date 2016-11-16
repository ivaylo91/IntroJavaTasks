package inputoutput.tasks.directory.browser;

import java.io.File;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class Directory {

    private String name;
    private boolean isDirectory;
    private boolean isFile;

    public Directory(File name){

        this.name = name.getName();

        isDirectory = name.isDirectory();

        isFile = name.isFile();
    }

    public String getName(){

        return name;
    }

    public boolean isDirectory(){

        return isDirectory;
    }

    public boolean isFile(){

        return isFile;
    }
}
