package objects.tasks.homgenioustree;

/**
 * Created by ivaylo on 11/1/16.
 */
public class Node {

    public int value;
    public Node parent;
    public Node leftchild;
    public Node rightchild;

    public Node(int value) {
        this.value = value;
    }
}
