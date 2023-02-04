package hardtask.colle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDraft1 {
    public static void main(String[] args) {
        byte cntr = 0;
        ArrayList<String> list = new ArrayList<>();
        List<String> listTwin = Arrays.asList("first", "second");
        list.add("third");
        list.add(1, "fifth");
        list.addAll(listTwin);
        list.addAll(0, listTwin);
        ArrayList<String> cloneList = (ArrayList<String>) list.clone();
        System.out.println(cloneList);
        cloneList.clear();
        System.out.println("Содержит ли fourth?: " + list.contains("fourth"));
        for (String s : list) {
            System.out.printf(cntr + ". %s\n", s);
            cntr++;
        }
        System.out.println("Размер списка: " + list.size());
    }
}
