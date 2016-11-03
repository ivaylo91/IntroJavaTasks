package inputoutput.tasks;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 02.11.16.
 */
public class ConsoleReader {

    private Scanner input = new Scanner(System.in);


    public String readString(){

        return input.nextLine();
    }
    public Float readFloat(){

        return input.nextFloat();
    }
    public Integer readInt(){
        return input.nextInt();
    }
    public char readChar() throws IOException{

        if(input.hasNext()){

            return input.next().charAt(0);
        } else{

            throw new InputMismatchException("Invalid input from console.Please try again.");
        }
    }
}
