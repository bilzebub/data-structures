package learn.datastructures.linkedlist;

class Node<T> {
  private T data;
  private Node<T> next, previous;

  public Node(T data) {
    this.data = data;
  }

  public Node(T data, Node<T> previous) {
    this.data = data;
    this.previous = previous;
  }

  public T getData() {
    return data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public Node<T> getPrevious() {
    return previous;
  }

  public void setPrevious(Node<T> previous) {
    this.previous = previous;
  }

  @Override
  public String toString() {
    return data.toString();
  }
}
