package inputoutput.tasks.directory.browser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class DirectoryBrowser {

    private boolean isFile;

    private boolean isDirectory;

    public Directory [] checkIsFileOrDirectory(String filePath) throws FileNotFoundException {

        Path path = Paths.get(filePath);

        if(Files.notExists(path)){

            throw  new FileNotFoundException();
        }

        File[] files = new File(filePath).listFiles();

        Directory [] directories = new Directory[files.length];

        for (int i=0; i< directories.length; i++){

            directories[i] = new Directory(files[i]);
        }

        return directories;
     }


}