package books.leonardtasks.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SumIntegers2 {
    public static int sumIntegers2(List<Integer> integers) {
        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream()
            .filter(Objects::nonNull)
            .mapToInt (Integer::intValue).sum();
    }
    public static boolean integersContainsNulls(List<Integer> integers) {
        if (integers == null) {
            return false;
        }
        return integers.stream()
            .anyMatch (Objects::isNull);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
        System.out.println(sumIntegers2(numbers)); // 30
    }
}
