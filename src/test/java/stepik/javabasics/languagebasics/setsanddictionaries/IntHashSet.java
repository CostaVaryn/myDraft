package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.*;

public class IntHashSet {
    public static void main(String[] args) {
        Random random = new Random(30);
        Set<Integer> iset = new HashSet<Integer>();

        for(int i = 0; i < 25; i++)
            iset.add(random.nextInt(10));

        // Вывести в консоль записи
        Iterator<Integer> itr = iset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }
}
