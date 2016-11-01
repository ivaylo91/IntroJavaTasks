package objects.tasks.heterogenioustree;

import java.util.Objects;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 11/1/16.
 */
public class HeterogeniousTree {

    private Node root;

    public void insert(int value, Object object) {
        this.root = insertNode(value, null, root, object);
    }

    private Node insertNode(Integer value, Node parentNode, Node currentNode, Object object) {

        if (currentNode == null) {

            currentNode = new Node(value);

            currentNode.parent = currentNode;

            currentNode.object = object;
        }
        if (value < currentNode.value) {

            currentNode.leftChild = insertNode(value, currentNode, currentNode.leftChild, object);
        } else if (value > currentNode.value) {
            currentNode.rightChild = insertNode(value, currentNode, currentNode.rightChild, object);
        }

        return currentNode;
    }

    public void printAllNode() {
        printAllNode(root);
    }

    private void printAllNode(Node root) {

        if (root == null) {
            return;
        }
        if (root.leftChild == null) {
            System.out.println(root.object + " ");
        } else {
            printAllNode(root.leftChild);
            System.out.println(root.object + " ");
        }
        if (root.rightChild == null) {
            return;
        }
        if (root.leftChild == null) {
            System.out.println(root.object + " ");
        }
        printAllNode(root.rightChild);
    }

    public Object findNode(Integer value) {

        if (value == null) {

            return null;
        }
        return findNode(value, root).object;
    }

    private Node findNode(Integer value, Node currentNode) {
        if (currentNode == null) {

            return null;
        }
        if (value == currentNode.value) {

            return currentNode;
        } else if (value < currentNode.value) {
            currentNode = findNode(value, currentNode.leftChild);
        } else {
            currentNode = findNode(value, currentNode.rightChild);
        }

        return currentNode;
    }

}
