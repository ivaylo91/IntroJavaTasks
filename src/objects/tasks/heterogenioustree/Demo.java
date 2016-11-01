package objects.tasks.heterogenioustree;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com) on 11/1/16.
 */
public class Demo {

    public static void main(String args[]) {

        HeterogeniousTree heterogeneousTree = new HeterogeniousTree();

        heterogeneousTree.insert(4, 1);
        heterogeneousTree.insert(2, "Ivan");
        heterogeneousTree.insert(1, "George");
        heterogeneousTree.insert(3, 3.6);
        heterogeneousTree.insert(5, new Double(12.4));


        heterogeneousTree.printAllNode();

    }
}
