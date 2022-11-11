package stepik.adaptivecourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PrinlList {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for(String s : nameList) {
            System.out.println(s);
        }

        List<String> set = new ArrayList<>(Arrays.asList("Alpha", "Gamma", "Omega"));
        System.out.println(set);
    }
}
