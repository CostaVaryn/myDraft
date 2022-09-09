package stepik.introductory.scanner;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble(), y = sc.nextDouble();
        double square = x * y;
        double perimeter = 2 * (x + y);
        System.out.println(square);
        System.out.println(perimeter);
        sc.close();

        /**
         * x += y;    // То же самое, что и x = x + y;
         * x -= y;    // То же самое, что и x = x - y;
         * x *= y;    // То же самое, что и x = x * y;
         * x /= y;    // То же самое, что и x = x / y;
         * x %= y;    // То же самое, что и x = x % y;
         */


       /**
        int x = sc.nextInt(), y = sc.nextInt();
        int sum = x + y;
        System.out.print(sum);
        */
    }
}
