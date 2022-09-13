package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class RelationshipSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println((a < b) ? "<" : (a > b) ? ">" : "=");
    }
}

/**
 * На вход подаётся два числа - a и b. Выведите знак отношения между числами:
 * один символ "<", если a < b, ">", если a > b и "=", если a=b.
 *
 * Sample Input 1:
 * 8 11
 * Sample Output 1:
 * <
 * Sample Input 2:
 * 10 5
 * Sample Output 2:
 * >
 */