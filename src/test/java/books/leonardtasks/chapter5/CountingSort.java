package books.leonardtasks.chapter5;

public class CountingSort {
    public static void countingsort(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] counts = new int[max - min + 1];
        for (int j : arr) {
            counts[j - min]++;
        }
        int sortedlndex = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[sortedlndex++] = i + min;
                counts[i]--;
            }
        }
    }

}
