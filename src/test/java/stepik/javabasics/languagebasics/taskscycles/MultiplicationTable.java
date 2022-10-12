package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        sc.close();
        for (long i = 1; i < 10; i++) {
            long result = a * i;
            System.out.println(a + " * " + i + " = " + result);
        }
    }
}

/*
Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.

Входные данные
Задано натуральное число n.

Выходные данные
Выведите ответ на задачу.

Sample Input 1:
2
Sample Output 1:
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
Sample Input 2:
8
Sample Output 2:
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
 */