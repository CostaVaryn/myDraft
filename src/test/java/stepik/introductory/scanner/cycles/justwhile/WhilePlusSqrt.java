package stepik.introductory.scanner.cycles.justwhile;

import java.util.Scanner;

public class WhilePlusSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt()), x = 1;
        while ((x * x) <= n) {
            System.out.print((x * x) + " ");
            ++x;
        }
    }
}

/*
 * На ввод подаётся натуральное число n.
 * Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел, если эти квадраты не превышают n.
 *
 * Sample Input:
 * 30
 * Sample Output:
 * 1 4 9 16 25
 */
