package books.leonardtasks.chapter2;

import java.util.*;

public class EvenIntegers2 {
    public static List<Integer> evenIntegers2(List<Integer> integers) {
        if (Objects. isNull (integers)) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr: integers) {
            if (Objects.nonNull (nr) && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
        System.out.println(evenIntegers2(numbers));
    }
}
