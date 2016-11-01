package objects.tasks.heterogenioustree;

import java.util.Objects;

/**
 * @author Ivaylo Penev on 11/1/16.
 */
public class Node {

    public Integer value;
    public Node leftChild;
    public Node rightChild;
    public Node parent;
    public Object object;

    public Node(int value) {
        this.value = value;
    }
}
