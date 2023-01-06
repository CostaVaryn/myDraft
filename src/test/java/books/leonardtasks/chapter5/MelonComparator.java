package books.leonardtasks.chapter5;

import java.util.Comparator;

public class MelonComparator implements Comparator<Melon> {
    @Override
    public int compare(Melon o1, Melon o2) {
        return o1.getType().compareTo(o2.getType()) ;
    }
    public static void main(String[] args) {
        Comparator<Melon> byType = Comparator.comparing(Melon::getType);
        // Comparator<Melon> byType = Comparator.comparing(Melon::getType).reversed();


    }
}

