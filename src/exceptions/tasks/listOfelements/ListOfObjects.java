package exceptions.tasks.listOfelements;

import java.util.Arrays;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class ListOfObjects {

    private Object[] list;
    private int size;
    private int index;

    public ListOfObjects(int size) {

        this.list = new Object[size];
        this.size = size;
    }

    public void add(Object object) {

        if (index > list.length) {

            throw new ArrayIndexOutOfBoundsException("Invalid index");
        } else {

            list[index] = object;
            index++;
        }
    }

    public void remove() {

        if (list[0] == null) {

            throw new RuntimeException("List is empty");

        } else {
            index--;
            list[index] = null;
        }
    }

    public Object printAllElements() {

        return Arrays.toString(list);
    }
}
