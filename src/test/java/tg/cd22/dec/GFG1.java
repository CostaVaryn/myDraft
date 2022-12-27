package tg.cd22.dec;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class GFG1 {
    public static void main(String[] args) throws Exception {
        try {
            AbstractList<String> arrlist = new ArrayList<String>();

            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("D");
            arrlist.add("E");

            System.out.println("Original AbstractList: " + arrlist);

            List<String> arrlist2 = arrlist.subList(2, 4);
            System.out.println("Sublist of AbstractList: " + arrlist2);
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
