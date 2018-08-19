package learn.binarytree;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            root.ins(data);
        }
    }

    @Override
    public void delete(T data) {
        if (root != null) {
            root = root.del(data);
        }
    }

    @Override
    public T max() {
        if (root == null) return null;
        Node<T> retval = root;
        while (retval.getRight() != null) {
            retval = retval.getRight();
        }
        return retval.getData();
    }

    @Override
    public T min() {
        if (root == null) return null;
        Node<T> retval = root;
        while (retval.getLeft() != null) {
            retval = retval.getLeft();
        }
        return retval.getData();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (root != null) sb.append(root);
        return sb.append("]").toString();
    }
}
