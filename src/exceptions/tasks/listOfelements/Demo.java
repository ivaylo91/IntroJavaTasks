package exceptions.tasks.listOfelements;

/**
 * Created by ivaylo on 11/14/16.
 */
public class Demo {

    public static void main(String[] args) {

        ListOfObjects listOfObjects = new ListOfObjects(3);

        listOfObjects.add(20);
        listOfObjects.add("Gosho");
        listOfObjects.add(2.45);

        listOfObjects.remove();

        listOfObjects.printAllElements();

    }
}
