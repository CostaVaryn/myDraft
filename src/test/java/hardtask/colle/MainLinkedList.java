package hardtask.colle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("LinkedList is empty?: " + linkedList.isEmpty());
        linkedList.add("Albert");
        linkedList.add("Carl");
        linkedList.add("Elon");
        linkedList.add("Dereck");
        linkedList.add("Barry");
        System.out.println("LinkedList is empty?: " + linkedList.isEmpty());
        System.out.println("Size LinkedList?: " + linkedList.size());
        System.out.println(linkedList + " size = " + linkedList.size());
        linkedList.add(3, "Mark");
        System.out.println(linkedList + " size = " + linkedList.size());
        linkedList.remove(0);
        System.out.println(linkedList + " size = " + linkedList.size());


        Random random = new Random();
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        int cntr = 0;
        while (cntr < 10_000_000) {
            linkedListInt.add(random.nextInt());
            cntr++;
        }

        long startTime = System.nanoTime();
        linkedListInt.remove(5000);
        long endTime = System.nanoTime();

        System.out.println("Time to remove: " + (endTime - startTime));
    }
}
