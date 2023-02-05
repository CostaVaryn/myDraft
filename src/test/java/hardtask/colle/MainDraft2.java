package hardtask.colle;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainDraft2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Albert");
        hashSet.add("Carl");
        hashSet.add("Elon");
        hashSet.add("Dereck");
        hashSet.add("Barry");
        System.out.println("HashSet size: " + hashSet.size());
        for (String s : hashSet) {
            System.out.println(s);
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Albert");
        linkedHashSet.add("Carl");
        linkedHashSet.add("Elon");
        linkedHashSet.add("Dereck");
        linkedHashSet.add("Barry");
        System.out.println("HashSet size: " + linkedHashSet.size());
        for (String s : linkedHashSet) {
            System.out.println(s);
        }

        TreeSet<String> treeSet= new TreeSet<>();
        treeSet.add("Albert");
        treeSet.add("Carl");
        treeSet.add("Elon");
        treeSet.add("Dereck");
        treeSet.add("Barry");
        System.out.println("HashSet size: " + treeSet.size());
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
