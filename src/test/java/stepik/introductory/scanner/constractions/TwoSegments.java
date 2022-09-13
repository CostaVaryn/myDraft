package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class TwoSegments {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        if ((b1 < a2) || (b2 < a1)) {
            System.out.print ("Пересечения нет");
        } else if (b2 > b1) {
            if ((a1 < a2) && (b1 > a2)) {
                System.out.print (a2 + " " + b1);
            } else if ((a2 < a1) || (a1 == a2)) {
                System.out.print (a1 + " " + b1);
            } else if (b1 == a2)  {
                System.out.print (b1);
            }
        } else if (b1 > b2) {
            if ((a1 < a2) || (a1 == a2)) {
                System.out.print (a2 + " " + b2);
            } else if ((a2 < a1) && (b2 > a1)) {
                System.out.print (a1 + " " + b2);
            } else if (b2 == a1) {
                System.out.print (a1);
            }
        } else if (b2 == b1) {
            if ((a2 == a1) || (a1 > a2)) {
                System.out.print (a1 + " " + b1);
            } else if (a2 > a1) {
                System.out.print (a2 + " " + b1);
            }
        }
        sc.close();
    }
}

/**
 * Sample Input 1:
 * 2 5
 * 6 10
 * Sample Output 1:
 * Пересечения нет
 *
 * Sample Input 2:
 * 2 5
 * 4 10
 * Sample Output 2:
 * 4 5
 */