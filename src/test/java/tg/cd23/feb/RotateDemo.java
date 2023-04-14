package tg.cd23.feb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Kotlin");
        list.add("JavaScript");
        list.add("TypeScript");
        System.out.println("Original list: " + list);
        Collections.rotate(list, 2);
        System.out.println("Rotated list: " + list);
    }
}
