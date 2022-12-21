package books.leonardtasks.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenIntegers {

    public static List<Integer> evenIntegers(List<Integer> integers) {
        if (integers == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr: integers) {
            if (nr != null && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
        System.out.println(evenIntegers(numbers));
    }
}
