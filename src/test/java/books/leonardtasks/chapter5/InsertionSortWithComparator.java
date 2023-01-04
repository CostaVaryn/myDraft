package books.leonardtasks.chapter5;

import java.util.Comparator;

public class InsertionSortWithComparator {
    public static <T> void insertionSortWithComparator(
        T[] arr, Comparator<? super T> c) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && c.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
