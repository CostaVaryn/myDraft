package hardtask.colle;

import java.util.ArrayList;
import java.util.HashSet;

public class MainDraft3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Albert");
        list.add("Carl");
        list.add(null);
        list.add("Elon");
        list.add(null);
        list.add("Dereck");
        list.add(null);
        list.add("Barry");
        System.out.println("ArrayList size: " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Albert");
        hashSet.add("Carl");
        hashSet.add(null);
        hashSet.add("Elon");
        hashSet.add(null);
        hashSet.add("Dereck");
        hashSet.add(null);
        hashSet.add("Barry");
        System.out.println("HashSet size: " + hashSet.size());
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
