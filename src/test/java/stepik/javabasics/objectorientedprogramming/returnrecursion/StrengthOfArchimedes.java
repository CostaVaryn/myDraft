package stepik.javabasics.objectorientedprogramming.returnrecursion;

import java.util.Scanner;

public class StrengthOfArchimedes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        System.out.println("F = " + F + " H");
    }
    static int arhimed(int a, int b) {
        return a * 10 * b;
    }
}

/*
Напишите функцию arhimed, которая принимает на вход 2 натуральных числа: плотность жидкости (кг/м^3),
в которую погружают тело и объём тела (м^3). Функция должна именно вернуть значение силы Архимеда.
Считать g = 10 H/кг. Содержание функции main менять запрещено.

Sample Input:
1000
2
Sample Output:
F = 20000H
 */