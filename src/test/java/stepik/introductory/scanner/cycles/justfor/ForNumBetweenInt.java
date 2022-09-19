package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForNumBetweenInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i%2 == 1 || i%2 == -1) {
                System.out.print(i + " ");
            }
        }
        for (int i = b; i <= a; i++) {
            if (i%2 == -1 || i%2 == 1) {
                System.out.print(i + " ");
            }
        }
        for (int i = a; i == b;) {
            if (i%2 == 1 || i%2 == -1) {
                System.out.print(" ");
            }
        }
    }
}

/**
 * Выведите все нечётные целые числа, находящиеся между введёнными числами (включительно),
 * в одной строке через пробел, в порядке возрастания.
 *
 * Sample Input 1:
 * 4 10
 * Sample Output 1:
 * 5 7 9
 *
 * Sample Input 2:
 * 3 11
 * Sample Output 2:
 * 3 5 7 9 11
 */
