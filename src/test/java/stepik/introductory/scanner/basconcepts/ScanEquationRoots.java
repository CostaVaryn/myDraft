package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        sc.close();
        double sum = (-1 * b) / a;
        double mult = c / a;
        System.out.println(sum + " " + mult);
    }
}

/*
Sample Input:
1 2 -4

Sample Output:
-2.0 -4.0
 */
