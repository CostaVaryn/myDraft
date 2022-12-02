package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class WhoIsBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        if (a > b) {
            System.out.println(a);
        } else {
            if (a < b) {
                System.out.println(b);
            } else {
                System.out.println(Math.max(a, b));
            }
        }
    }
}

/*
С клавиатуры вводятся два числа. Выведите на экран большее из них.

Sample Input:
8 11
Sample Output:
11
 */