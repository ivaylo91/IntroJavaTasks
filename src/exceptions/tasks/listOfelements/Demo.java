package exceptions.tasks.listOfelements;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
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
