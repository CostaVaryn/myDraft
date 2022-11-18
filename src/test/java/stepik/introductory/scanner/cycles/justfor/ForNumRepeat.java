package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForNumRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt()), b = Math.abs(sc.nextInt());
        sc.close();
        for (int i = 0; i < b; i++) {
            System.out.print(a + " ");
        }
    }
}

/*
 * На вход подаётся два натуральных числа - n и m.
 * Напечатайте число n, повторённое m раз в одной строке через пробел.
 *
 * Sample Input:
 * 3 5
 * Sample Output:
 * 3 3 3 3 3
 */
