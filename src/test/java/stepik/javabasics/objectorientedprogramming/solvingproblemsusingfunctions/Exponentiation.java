package stepik.javabasics.objectorientedprogramming.solvingproblemsusingfunctions;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
    static double pow(double x, int y) {
        double result = 1.0;
        if (y > 0) {
            for (int i = 0; i < y; i++) {
                result *= x;
            }
        }
        return result;
    }
}

/*
Напишите функцию возведения числа в степень pow.

Входные данные
Вводится 2 числа - a (вещественное) и n (целое неотрицательное).

Выходные данные
Необходимо вывести  значение an.

Пользоваться функцией pow из библиотеки Math запрещено. Содержание функции main менять запрещено.

Sample Input:
2
5
Sample Output:
32.0
 */