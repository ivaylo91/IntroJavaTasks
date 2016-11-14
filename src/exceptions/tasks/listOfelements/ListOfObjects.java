package exceptions.tasks.listOfelements;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class ListOfObjects {

    private Object[] list;
    private int size;
    private int index;

    /**
     * @param size is a size of list of Object.
     */

    public ListOfObjects(int size) {

        this.list = new Object[size];
        this.size = size;
    }

    /**
     * @param object is a element of list which add.
     */
    public void add(Object object) {

        if (index > list.length) {

            throw new ArrayIndexOutOfBoundsException("Invalid index");
        } else {

            list[index] = object;
            index++;
        }
    }

    //remove last element of list

    public void remove() {

        if (list[0] == null) {

            throw new RuntimeException("List is empty");

        } else {

            index--;

            list[index] = null;
        }
    }

    /**
     * Use a lambda expression to print all elemtents of list;
     */
    public void printAllElements() {

        Arrays.stream(list).forEach(System.out::println);
    }
}
