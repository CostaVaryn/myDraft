package books.leonardtasks.chapter5;

import java.util.Arrays;
import java.util.Collections;

public class SonMelon {

    public static <T> void reverse(T[] arr) {
        for (int leftHead = 0, rightHead = arr.length - 1;
             leftHead < rightHead; leftHead++, rightHead--) {
            T elem = arr[leftHead];
            arr[leftHead] = arr[rightHead];
            arr[rightHead] = elem;
        }
    }

    public static void main(String[] args) {
        Melon[] melons = {
                new Melon("Crenshaw", 2000),
                new Melon("Gac", 1200),
                new Melon("Bitter", 2200)
        };

        Collections.reverse(Arrays.asList(melons));

    }
}