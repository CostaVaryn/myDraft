package books.leonardtasks.chapter5;

import java.util.Comparator;

public class BubbleSortWithComparator {
    public static <T> void bubbleSortWithComparator(
        T[] arr, Comparator<? super T> c) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i- 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) >0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
