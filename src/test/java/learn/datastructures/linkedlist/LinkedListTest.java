package learn.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {


  @Test
  void test() {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);

    assertEquals(Integer.valueOf(3), list.get(0));
    assertEquals(Integer.valueOf(4), list.get(1));
    assertEquals(Integer.valueOf(5), list.get(2));

    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));

    assertEquals(3, list.size());
  }
}
