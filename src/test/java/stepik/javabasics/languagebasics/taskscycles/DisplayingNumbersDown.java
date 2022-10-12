package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class DisplayingNumbersDown {
    public static void main(String[] args) {
        long a = 50;
        long b = 0;
        for (long i = a; i >= b; i--) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}

/*
Напишите программу, которая выводит в столбик целые числа от 50 до 0     с шагом 10.

Sample Input:

Sample Output:
50
40
30
20
10
0
 */