package inputoutput.tasks.object;

import javax.xml.crypto.Data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream out = null;
        FileInputStream in = null;

        DataClass dc = new DataClass();
        Person person = new Person();

        person.setAge(20);
        person.setName("Georgi");

        try{
           out = new FileOutputStream("person.ser");
           in = new FileInputStream("person.ser");

           dc.saveObject(out,person);
           dc.readObject(in);
        }catch (IOException ex){
            ex.printStackTrace();
        } finally {

            if(out !=null){
                out.close();
            }
            if(in != null){
                in.close();
            }
        }
        System.out.println("Object Deserialize.....");
        System.out.println("Student name:" + person.getName());
        System.out.println("Age:" + person.getAge());
    }
}
