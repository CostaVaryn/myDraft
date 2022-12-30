package books.leonardtasks.chapter5;

import java.util.Arrays;

public class ContainsElement {
    public static boolean containsElement(int[] arr, int toContain) {
        for (int elem: arr) {
            if (elem == toContain) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsElement2(int[] arr, int toContain) {
        return Arrays.stream (arr)
                .anyMatch(e -> e == toContain);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 3, 7, 4, 1};
        System.out.println(containsElement(numbers,3));

        System.out.println(containsElement2(numbers,2));
    }


}
