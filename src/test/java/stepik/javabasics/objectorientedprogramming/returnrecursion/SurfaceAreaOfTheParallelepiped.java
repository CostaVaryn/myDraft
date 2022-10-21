package stepik.javabasics.objectorientedprogramming.returnrecursion;

import java.util.Scanner;

public class SurfaceAreaOfTheParallelepiped {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        area(a, b, c);
    }
    static void area(int a, int b, int c) {
        int S = 2 * (c * a + c * b + a * b);
        System.out.println(S);
    }
}

/*
Напишите функцию area, которая принимает на вход 3 натуральных числа - ширину,
высоту и длину прямоугольного параллелепипеда, а находит и выводит на экран площадь его поверхности.
Содержание функции main менять запрещено.

Sample Input:
3
4
5
Sample Output:
94
 */