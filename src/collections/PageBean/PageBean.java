package collections.PageBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ipenev91@gmail.com (Ivaylo Penev)
 */
public class PageBean {

    private List<String> list;
    private int pageSize;
    private int firstElement;
    private int lastElement;
    private int index;

    public PageBean(int pageSize, List<String> list) {
        this.pageSize = pageSize;
        this.list = list;
    }

    public List<String> next() {

        if (hasNext()) {

            firstElement = index;

            lastElement = index + pageSize;

            index += pageSize;
        } else {
            throw new RuntimeException("No next page");
        }

        return list.subList(firstElement, lastElement);
    }

    public boolean hasNext() {

        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> previous() {
        if (hasPrevious()) {
            firstElement = index - pageSize * 2;

            lastElement = index - pageSize;

            index -= pageSize;
        }

        return list.subList(firstElement, lastElement);
    }

    public boolean hasPrevious() {

        if (index == pageSize) {

            return true;
        } else {
            return false;
        }
    }

    public List<String> firstPage() {
        index = 0;

        firstElement = index;

        lastElement = index + pageSize;

        index += pageSize;

        return list.subList(firstElement, lastElement);
    }

    public List<String> lastPage() {

        index = list.size() - (list.size() / pageSize) + 1;

        lastElement = list.size();

        index -= pageSize;

        return list.subList(firstElement, lastElement);
    }

    public int getCurrentPage() {

        return index / pageSize;
    }
}
