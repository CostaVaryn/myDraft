package tg.cd22.dec;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleListCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
