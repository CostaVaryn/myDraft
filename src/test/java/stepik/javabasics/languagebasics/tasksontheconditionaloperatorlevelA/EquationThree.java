package stepik.javabasics.languagebasics.tasksontheconditionaloperatorlevelA;

import java.util.Scanner;

public class EquationThree {
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
                System.out.println("1");
            }
        } else if (D < 0) {
            System.out.println("0");
        } else if(D > 0) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
    }
}

/*
Вводятся три целых числа: a, b и c - коэффициенты квадратного уравнения.
Определите количество его корней.
Вам достаточно вывести одно целое число - количество корней уравнения.
Если корней бесконечно много, ты выведите строку "inf".

Sample Input 1:
1
-5
6
Sample Output 1:
2

Sample Input 2:
1
2
1
Sample Output 2:
1
 */