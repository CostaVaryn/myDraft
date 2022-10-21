package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class PrimeNumbersInBetween {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }
    static void simpleAB(int a, int b) {
        while (a <= b) {
            if (a == 1) {
                System.out.println(a + " - " + 1);
            } else if (a > 3 && ((a % 2 == 0) || (a % 3 == 0))) {
                System.out.println(a + " - составное");
            } else {
                System.out.println(a + " - простое");
            }
            a++;
        }
    }
}

/*
Напишите функцию simpleAB, которая принимает 2 натуральных числа a и b (a <= b)
и анализирует все числа на промежутке от a до b включительно на их простоту.
Она должна вывести на экран для каждого числа строку вида "{число} - {простое/составное/1}".
Содержание функции main менять запрещено.

Sample Input:
1
6
Sample Output:
1 - 1
2 - простое
3 - простое
4 - составное
5 - простое
6 - составное
 */