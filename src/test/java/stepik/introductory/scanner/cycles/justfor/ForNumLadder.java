package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForNumLadder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+(j==i?"\n":" "));
            }
        }
    }
}

/**
 * Напечатайте "лесенку" из чисел от единицы до n, n > 0.
 * Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
 *
 * Sample Input:
 * 3
 * Sample Output:
 * 1
 * 1 2
 * 1 2 3
 */
