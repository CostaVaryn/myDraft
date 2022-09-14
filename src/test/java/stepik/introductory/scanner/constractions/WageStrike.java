package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class WageStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int x = sc.nextInt();
        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int res = max % min;
        sc.close();
        if (res > x) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
    }
}

/**
 * Sample Input:
 * 300 400 500
 * 100
 *
 * Sample Output:
 * Ура, бастуем!
 */