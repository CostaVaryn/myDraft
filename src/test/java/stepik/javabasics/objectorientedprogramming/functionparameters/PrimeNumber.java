package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }

    static void simple(Integer n) {

        if (n > 3 && ((n % 2 == 0) || (n % 3 == 0)) || n == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

        /*
        int j = 2;
        boolean isprime = true;
        for (j = 2; j <= n/j; j++) {
            if ((n % j) == 0) {
                isprime = false;
            }
        }
        if (isprime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         */
    }
}

/*
Напишите функцию simple, которая принимает одно целое число и определяет,
является ли число простым и выводит на экран ответ: "YES"/"NO".
Содержание функции main менять запрещено.

Sample Input:
3
4
19
Sample Output:
YES
NO
YES
 */