package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a >= b && a <= c || a <= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b <= c || b <= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        sc.close();
    }
}

/**
 * Sample Input:
 * 5 10 11
 *
 * Sample Output:
 * 10
 */