package books.leonardtasks.chapter2;

import java.util.Arrays;
import java.util.List;

public class SumIntegers {
    public static int sumIntegers(List<Integer> integers) {
        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream()
            .filter(i -> i != null)
            .mapToInt(Integer::intValue).sum();
    }
    public static boolean integersContainsNulls(List<Integer> integers) {
        if (integers == null) {
            return false;
        }
        return integers.stream()
            .anyMatch(i -> i == null);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
        System.out.println(sumIntegers(numbers)); // 30
    }
}
