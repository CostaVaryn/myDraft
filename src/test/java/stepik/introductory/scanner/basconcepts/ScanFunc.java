package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        double y = 5 * (x*x) + 2*x + 11;
        System.out.println(y);

        /*
         *         Scanner sc = new Scanner(System.in);
         *         int a = sc.nextInt();
         *         System.out.print(a + " " + a * a + " " + a * a * a);
         */
    }
}
