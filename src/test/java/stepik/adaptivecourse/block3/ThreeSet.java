package stepik.adaptivecourse.block3;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSet {
    public static void main(String[] args) {
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for(Object s : nameSet) {
            System.out.println(s);
        }
    }
}
