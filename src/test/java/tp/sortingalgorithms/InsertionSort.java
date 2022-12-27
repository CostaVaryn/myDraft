package tp.sortingalgorithms;

public class InsertionSort {
    public static void insertionSort(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        insertionSort(sortArr);
        for (int j : sortArr) {
            System.out.print(j + "\n");
        }
    }
}
