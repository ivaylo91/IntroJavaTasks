package objects.tasks.homgenioustree;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 11/1/16.
 */
public class Demo {

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(theTree.root, 20);
        theTree.addNode(theTree.root, 13);
        theTree.addNode(theTree.root, 24);
        theTree.addNode(theTree.root, 10);
        theTree.addNode(theTree.root, 17);

        theTree.postOrder(theTree.root);

        System.out.println(theTree.findNode(theTree.root, 13) ? "Found" : "No found");
    }
}
