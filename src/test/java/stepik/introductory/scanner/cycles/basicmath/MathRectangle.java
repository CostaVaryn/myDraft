package stepik.introductory.scanner.cycles.basicmath;

import java.util.Scanner;

public class MathRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        double c = Math.pow((Math.pow(a,2) + Math.pow(b,2)), 1.0/2.0);
        double res = a + b + c;
        System.out.println(Math.round(res) * 1.0);
    }
}

/*
 * На вход подаются длины двух катетов прямоугольного треугольника a и b.
 * Посчитайте и выведите на печать периметр этого треугольника.
 * Значение периметра необходимо округлить до целого (в математическом смысле, не типа int).
 *
 * Sample Input:
 * 3 4
 * Sample Output:
 * 12.0
 */
