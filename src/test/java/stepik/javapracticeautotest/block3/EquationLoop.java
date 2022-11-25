package stepik.javapracticeautotest.block3;

import java.util.Scanner;

public class EquationLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        int D = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0 && c != 0) {
                System.out.println("0");
            } else if (b == 0 && c == 0) {
                System.out.println("inf");
            } else {
                // 1 root
                double x = (double) (-c) / b;
                System.out.println(x);
            }
        } else if (D < 0) {
            System.out.println("без корней");
        } else if (D > 0) {
            // 2 roots
            double x1 = (double) (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (double) (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else {
            // 1 root
            double x = (double) (-b) / (2 * a);
            System.out.println(x);
        }
    }
}

/*
Напишите программу для решения квадратных уравнений.

Для заданных коэффициентов квадратного уравнения (ax² + bx + c = 0),
верните один или два корня уравнения, если они существуют в области действительных чисел.

Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out.

Формат вывода:

"x₁ x₂" (два корня в любом порядке, разделенные пробелом), если есть два корня
"x" (просто значение корня), если есть единственный корень
просто строковое значение "без корней", если корня нет.
корни - вещественные числа
Параметр a гарантированно не равен нулю.

Sample Input:
1 -2 1

Sample Output:
1.0
 */