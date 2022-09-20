package stepik.introductory.scanner.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrNumsPrintFull {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String str= sc.nextLine();
        String[] arrayString = str.split(" ");
        int number = arrayString.length;
        int arr[] = new int[number];
        for(int i = 0; i < arrayString.length; i++) {
            arr[i] = Integer.valueOf(arrayString[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/**
 * На вход подаётся последовательность целых чисел.
 * Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
 *
 * Sample Input:
 * 3 6 2 14 1
 * Sample Output:
 * [1, 2, 3, 6, 14]
 */