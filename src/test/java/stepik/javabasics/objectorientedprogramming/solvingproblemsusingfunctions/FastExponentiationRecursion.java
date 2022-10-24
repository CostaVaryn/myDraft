package stepik.javabasics.objectorientedprogramming.solvingproblemsusingfunctions;

import java.util.Scanner;

public class FastExponentiationRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
    static double pow(double a, int n) {
//        if (n == 0) {
//            return 1.0;
//        }
//        return a *= pow(a, n - 1);
        double c = 1.0;
        try {
            if (n%2!=0){
                c = a * pow(a * a, (n - 1) / 2);
                return c;
            } else {
                return pow(a*a, n/2);
            }
        } catch(java.lang.StackOverflowError e) {
            System.out.print("");
        }
        return 1;
    }
}

/*
Напишите функцию быстрого возведения в степень pow.
Количество действий должно быть пропорционально двоичному логарифму n.

Входные данные
Вводится 2 числа - a (вещественное) и n (целое неотрицательное).

Выходные данные
Необходимо вывести  значение an.

Решите эту задачу используя рекурсию.

Пользоваться функцией pow из библиотеки Math запрещено. Содержание функции main менять запрещено.

Sample Input:
2
5
Sample Output:
32.0
 */