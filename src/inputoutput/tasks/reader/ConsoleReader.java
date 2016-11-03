package inputoutput.tasks.reader;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 02.11.16.
 */
public class ConsoleReader {

    /**
     * Scanner object input allowed to read from console.
     */
    private Scanner input = new Scanner(System.in);


    /**
     *
     * @return String message which is read from user input.
     */
    public String readString(){

        return input.nextLine();
    }

    /**
     *
     * @return Float number which is read from user input.
     */
    public Float readFloat(){

        return input.nextFloat();
    }

    /**
     *
     * @return Integer value which is read from user input.
     */

    public Integer readInt(){
        return input.nextInt();
    }

    /**
     *
     * @return  Char symbol which is read from user input.
     * @throws IOException if user cannot input character value.
     */
    public char readChar() throws IOException{

        if(input.hasNext()){

            return input.next().charAt(0);
        } else{

            throw new InputMismatchException("Invalid input from console.Please try again.");
        }
    }
}
