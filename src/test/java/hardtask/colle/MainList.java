package hardtask.colle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("ArrayList is empty?: " + list.isEmpty());
        list.add("Albert");
        list.add("Carl");
        list.add("Elon");
        list.add("Dereck");
        list.add("Barry");
        System.out.println("ArrayList is empty?: " + list.isEmpty());
        System.out.println("Size ArrayList?: " + list.size());
        System.out.println(list + " size = " + list.size());
        list.add(3, "Mark");
        System.out.println(list + " size = " + list.size());
        list.remove(0);
        System.out.println(list + " size = " + list.size());

        Random random = new Random();
        LinkedList<Integer> arrayListInt = new LinkedList<>();
        int cntr = 0;
        while (cntr < 10_000_000) {
            arrayListInt.add(random.nextInt());
            cntr++;
        }

        long startTime = System.nanoTime();
        arrayListInt.remove(5000);
        long endTime = System.nanoTime();

        System.out.println("Time to remove: " + (endTime - startTime));
    }
}
