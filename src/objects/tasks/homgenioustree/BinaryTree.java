package objects.tasks.homgenioustree;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 11/1/16.
 */
public class BinaryTree {

    public Node root;

    public BinaryTree() {

        this.root = null;
    }

    public void addNode(Node node, int value) {

        if (root == null) {

            node = new Node(value);

            root = node;

        } else if (value < node.value && node.leftchild == null) {

            node.leftchild = new Node(value);

            node.leftchild.parent = node;
        } else if (value > node.value && node.rightchild == null) {

            node.rightchild = new Node(value);

            node.rightchild.parent = node;
        }
    }

    public void inOrder(Node node) {

        if (node != null) {
            System.out.println(node.leftchild);

            System.out.println(node.value);

            System.out.println(node.rightchild);
        }
    }

    public void preOrder(Node node) {

        if (node != null) {

            System.out.println(node.value);
            System.out.println(node.leftchild);
            System.out.println(node.rightchild);
        }
    }

    public void postOrder(Node node) {

        if (node != null) {

            System.out.println(node.leftchild);
            System.out.println(node.rightchild);
            System.out.println(node.value);
        }
    }

    public boolean findNode(Node node, int value) {

        if (node == null) {

            return false;
        } else if (node.value == value) {
            return true;
        } else {
            if (value < node.value) {
                return findNode(node.leftchild, value);
            } else {
                return findNode(node.rightchild, value);
            }
        }
    }
}
