package stepik.introductory.scanner.cycles.basicmath;

import java.util.Scanner;

public class MathPowPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble(), n = sc.nextDouble();
        double res = Math.pow(Math.pow(x,y), 1/n);
        double scale = Math.pow(10, 5);
        System.out.println(Math.round(res * scale) / scale);
    }
}

/**
 * Даны числа x, y и n.
 * Выведите sqrt[n]{x^{y}}
 * Dведите ответ с точностью 5 знаков после запятой. Гарантируется, что выражение имеет действительное значение.
 * Результат выведите в виде числа типа double.
 * Примечание.
 * Если в ответе получается число с количеством знаков после запятой меньше, чем 5, выводить дополнительные нули не нужно!
 *
 * Sample Input:
 * 5 3 2
 * Sample Output:
 * 11.18034
 */
