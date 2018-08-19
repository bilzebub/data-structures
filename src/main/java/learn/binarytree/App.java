package learn.binarytree;

public class App {
    public static void main(String[] args) {
        Tree<Integer> tree = new BinaryTree<>();

        tree.insert(100);
        tree.insert(200);
        tree.insert(50);
        tree.insert(20);

        System.out.println(tree);

        System.out.println("min: " + tree.min());
        System.out.println("max: " + tree.max());

        tree.delete(50);
        System.out.println(tree);

        tree.delete(200);
        System.out.println(tree);

        tree.delete(100);
        System.out.println(tree);
    }
}
