package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrLengthNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i] + sc.nextInt();
        }
        System.out.print(arr[arr.length-1]);
    }
}

/**
 * На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке - последовательность целых чисел.
 * Создайте из неё массив и выведите на печать значение последнего элемента массива.
 *
 * Sample Input:
 * 5
 * 1 2 3 4 5
 * Sample Output:
 * 5
 */
