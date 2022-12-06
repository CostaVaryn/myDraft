package stepik.javapracticeautotest.block6;

import java.util.Scanner;

public class MainSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        String s = sc.next();

        System.out.println(Action.sum(a, a));
        System.out.println(Action.sum(a, b));
        System.out.println(Action.sum(s, a));
    }
}

class Action {
    static int sum(int a, int b) {
        return a + b;
    }
    static double sum(int a, double b) {
        return b + a;
    }
    static String sum(String s, int a) {
        return s + a;
    }
}

/*
Напишите программу, принимающую на вход последовательно по одному значению типа int, double и String.

Реализуйте класс Action таким образом, чтобы его метод sum возвращал корректные суммы для пар переменных,
указанных в методе main для пар вводимых значений.

Sample Input:
2
4.5
Jan

Sample Output:
4
6.5
Jan2
 */