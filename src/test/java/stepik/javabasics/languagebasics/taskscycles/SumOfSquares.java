package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println(sum);
    }
}

/*
Напишите программу, которая находит сумму квадратов натуральных чисел от 1 до n, где n вводится с клавиатуры.

Входные данные
Задано натуральное число n

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input 1:
5
Sample Output 1:
55
Sample Input 2:
1
Sample Output 2:
1
 */