package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class ProductOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        multiply(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
    static void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }
}

/*
Напишите функцию multiply, которая будет принимать в себя три целых числа и распечатывать на строке их произведение.
Содержание функции main менять запрещено.

Sample Input:
2
3
4
Sample Output:
24
 */