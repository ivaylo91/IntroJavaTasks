package inputoutput.tasks.object;

import java.io.*;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class DataClass implements Serializable {

    public void saveObject(OutputStream out, Object obj) throws IOException {

        ObjectOutputStream output = null;

        try{
            output = new ObjectOutputStream(out);

            output.writeObject(obj);

        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            if(output != null){
                output.close();
            }
        }
    }
    public Object readObject(InputStream in) throws IOException, ClassNotFoundException {

        ObjectInputStream inputStream = null;

        try {

            inputStream = new ObjectInputStream(in);

            inputStream.readObject();
        }catch (IOException ex){

            ex.printStackTrace();
        }catch (ClassNotFoundException excep){
            excep.printStackTrace();
        }finally {

            if(inputStream !=null){
                inputStream.close();
            }
        }

        return inputStream;
    }
}
