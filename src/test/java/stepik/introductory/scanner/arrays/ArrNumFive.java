package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrNumFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] nums = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            nums[i] = nums[i] + i;
            System.out.print(nums[i] + ((nums[i] == n) ? "" : " "));
        }

        /*
        for (int i = 1; i <= nums.length; i++) {
            System.out.println(i + " ");
        }
        */
    }
}

/*
 * На вход подаётся натуральное число n.
 * Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
 *
 * Sample Input:
 * 5
 * Sample Output:
 * 1 2 3 4 5
 */
