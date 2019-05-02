package kapitel12;

public class BinaryTreeTest {

    public static void main(String[] args) {

        BinaryTree<Integer> numberTree = new BinaryTree<Integer>();

        numberTree.insert(50);
        numberTree.insert(45);
        numberTree.insert(76);
        numberTree.insert(35);
        numberTree.insert(45);
        numberTree.insert(25);


        System.out.println("Anzahl an Zahlen: " + numberTree.size());
        numberTree.print();


        BinaryTree<String> wordTree = new BinaryTree<String>();

        wordTree.insert("Gabi");
        wordTree.insert("Franz");
        wordTree.insert("Helga");
        wordTree.insert("Zeus");
        wordTree.insert("Franz");

        System.out.println("Anzahl an Woerter: " + wordTree.size());
        wordTree.print();
    }
}
