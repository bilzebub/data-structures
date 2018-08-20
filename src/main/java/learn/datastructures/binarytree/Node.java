package learn.datastructures.binarytree;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> left, right;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void ins(T data) {
        int compare = data.compareTo(this.data);
        if (compare < 0) {
            if (left == null) {
                left = new Node<>(data);
            } else {
                left.ins(data);
            }
        } else if(compare > 0) {
            if (right == null) {
                right = new Node<>(data);
            } else {
                right.ins(data);
            }
        }
    }

    public Node<T> del(T data) {
        int compare = data.compareTo(this.data);
        if(compare == 0) {
            // no children
            if (left == null && right == null) {
                return null;
            }
            // both children
            if (left != null && right != null ) {
                // ???
                return null;
            }
            // left child
            if (left != null) {
                return left;
            }
            // right child
            return right;
        }
        if (compare < 0) {
            left = left.del(data);
        } else {
            right = right.del(data);
        }
        return this;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(left != null) sb.append(left).append(", ");
        sb.append(data);
        if(right != null) sb.append(", ").append(right);
        return sb.toString();
    }
}
