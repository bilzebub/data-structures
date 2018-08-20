package learn.datastructures.binarytree;

import java.util.function.Consumer;

public interface Tree<T> {
    void insert(T data);
    void delete(T data);
    T max();
    T min();
}
