package stepik.javabasics.objectorientedprogramming.solvingproblemsusingfunctions;

import java.util.Scanner;

public class MinimumOf4Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min(a, b, c, d));
    }
    static int min(int a, int b, int c, int d) {
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }
}

/*
Напишите функцию int min (int a, int b, int c, int d),
находящую наименьшее из четырех данных чисел и возвращающую ответ.

Входные данные
Вводится четыре числа.

Выходные данные
Необходимо вывести наименьшее из 4-х данных чисел.

Содержание функции main менять запрещено.

Sample Input:
3
1
2
6
Sample Output:
1
 */