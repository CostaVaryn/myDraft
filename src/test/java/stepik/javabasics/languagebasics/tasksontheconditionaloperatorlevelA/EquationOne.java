package stepik.javabasics.languagebasics.tasksontheconditionaloperatorlevelA;

import java.util.Scanner;

public class EquationOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        if (a == 0 && b == 0) {
            System.out.println("inf");
        } else {
            System.out.println(a != 0 ? "1" : "0");
        }
    }
}

/*
Вводятся два целых числа: a, b - коэффициенты линейного уравнения a * x + b = 0. Определите количество его корней.
Вам достаточно вывести одно целое число - количество корней квадратного уравнения.
Если корней бесконечно много, ты выведите строку "inf".

Sample Input 1:
1
-5
Sample Output 1:
1

Sample Input 2:
0
2
Sample Output 2:
0
 */