package stepik.introductory.scanner.cycles.basicmath;

import java.util.Scanner;

public class MathExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Math.abs(sc.nextDouble()), y = Math.abs(sc.nextDouble());
        double z;
        z = Math.pow(x, y);
        System.out.println(z);
    }
}

/**
 * На вход подаются два числа, x и y. Выведите на печать  x^{y}
 *
 * Sample Input:
 * 5 2
 * Sample Output:
 * 25.0
 */