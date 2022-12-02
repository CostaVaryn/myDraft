package tg;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add(1);
        list.add("Milk");
        list.add("11");
        System.out.println("LinkedList: " + list);

        Iterator x = list.descendingIterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }
    }
}
