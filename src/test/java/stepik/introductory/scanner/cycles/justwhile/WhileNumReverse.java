package stepik.introductory.scanner.cycles.justwhile;

import java.util.Scanner;

public class WhileNumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int val = num.length() - 1;
        do {
            System.out.print(num.charAt(val));
            val--;
        } while (val >= 0);
    }
}

/**
 * На вход подаётся натуральное число.
 * Выведите на печать составляющие его цифры в обратном порядке.
 *
 * Sample Input:
 * 12345
 *
 * Sample Output:
 * 54321
 */