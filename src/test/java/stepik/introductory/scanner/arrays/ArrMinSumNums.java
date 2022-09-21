package stepik.introductory.scanner.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrMinSumNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] nums = line.split(" ");
        Arrays.sort(nums);
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = Integer.valueOf(nums[i]);
        }
        if (nums.length <= 2) {
            System.out.println(0);
        }

        System.out.println(arr[0] + arr[2]);
    }
}

/**
 * Дана последовательность целых чисел.
 * Определите минимальную сумму пар элементов массива, расстояние (разница) между индексами которых равно 2.
 * Если таких пар нет, выведите 0.
 *
 * Sample Input:
 * 8 7 6 5 4 3 2
 * Sample Output:
 * 6
 */