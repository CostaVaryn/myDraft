package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class SumSameNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

/*
Напишите программу, которая находит сумму натуральных чисел от 1 до n, где n вводится с клавиатуры.

Входные данные
Задано натуральное число n

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input 1:
10
Sample Output 1:
55
Sample Input 2:
5
Sample Output 2:
15
 */