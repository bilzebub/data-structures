package learn.datastructures.linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

  private Node<E> first, last;
  private int size = 0;

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public boolean contains(Object o) {
    return false;
  }

  public Iterator<E> iterator() {
    return null;
  }

  public Object[] toArray() {
    return new Object[0];
  }

  public <T> T[] toArray(T[] a) {
    return null;
  }

  public boolean add(E t) {
    Node<E> newNode = new Node<>(t, last);
    if (first == null) {
      last = first = newNode;
    } else {
      last.setNext(newNode);
      last = newNode;
    }
    size++;
    return true;
  }

  public boolean remove(Object o) {
    return false;
  }

  public boolean containsAll(Collection<?> c) {
    return false;
  }

  public boolean addAll(Collection<? extends E> c) {
    return false;
  }

  public boolean addAll(int index, Collection<? extends E> c) {
    return false;
  }

  public boolean removeAll(Collection<?> c) {
    return false;
  }

  public boolean retainAll(Collection<?> c) {
    return false;
  }

  public void clear() {

  }

  public E get(int index) {
    if(isEmpty()) {
      throw new IndexOutOfBoundsException("Read from empty list");
    }
    Node<E> result = first;
    int i = 0;
    while (true) {
      if (result == null) {
        throw new IndexOutOfBoundsException("Index out of bounds");
      }
      if (i++ == index) break;
      result = result.getNext();
    }
    return result.getData();
  }

  public E set(int index, E element) {
    return null;
  }

  public void add(int index, E element) {

  }

  public E remove(int index) {
    return null;
  }

  public int indexOf(Object o) {
    return 0;
  }

  public int lastIndexOf(Object o) {
    return 0;
  }

  public ListIterator<E> listIterator() {
    return null;
  }

  public ListIterator<E> listIterator(int index) {
    return null;
  }

  public List<E> subList(int fromIndex, int toIndex) {
    return null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    Node<E> node = first;
    while (node != null) {
      sb.append(node).append(", ");
      node = node.getNext();
    }
    if (!isEmpty()) {
      sb.setLength(sb.length() - 2);
    }
    return sb.append("]").toString();
  }
}
