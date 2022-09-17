package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForNumSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i==(n-1)) break; {
                    for (int j = 1; j<=i; j++) {
                        if (i==n) break; {
                            System.out.print(i + (i==n ? "" : " "));
                        }
                    }
                }
            }
        }
    }
}

/**
 * Предположим, что мы работаем с последовательностью такого вида:
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ... .
 * Выведите на печать n (n > 0) членов данной последовательности в одну строку через пробел.
 *
 * Sample Input:
 * 5
 * Sample Output:
 * 1 2 2 3 3 3
 */