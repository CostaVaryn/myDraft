package books.leonardtasks.chapter5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Melon {
    private final String type;
    private final int weight;
    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Melon[] melons = new Melon[]{new Melon("Crenshaw", 2000),
                new Melon("Gac", 1200), new Melon("Bitter", 2200)
        };

        Arrays.sort(melons, new Comparator<Melon>() {
        @Override
            public int compare(Melon melon1, Melon melon2) {
                return Integer.compare(melon1.getWeight(), melon2.getWeight());
            }
        });

        /*
        Arrays.sort(melons, (Melon melon1, Melon melon2)
            -> Integer.compare(melon1.getWeight(), melon2.getWeight()));

         */

        Arrays.parallelSort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon melon1, Melon melon2) {
                return Integer.compare(melon1.getWeight(), melon2.getWeight ());
            }
        });

        /*
        Arrays.parallelSort(melons, (Melon melon1, Melon melon2)
            -> Integer.compare(melon1.getWeight(), melon2.getWeight()));
         */

        Arrays.sort(melons, new Comparator<Melon> () {
            @Override
            public int compare(Melon melon1, Melon melon2) {
                return (-1) * Integer.compare(melon1.getWeight(),
                        melon2.getWeight());
            }
        });

        Integer[] integers = new Integer[] {3, 1, 5};

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers);
        for (int leftHead = 0, rightHead = integers.length - 1;
             leftHead < rightHead; leftHead++, rightHead--) {
            int elem = integers[leftHead];
            integers[leftHead] = integers[rightHead];
            integers[rightHead] = elem;
        }

    }
}
