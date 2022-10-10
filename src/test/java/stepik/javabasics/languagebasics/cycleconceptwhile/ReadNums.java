package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class ReadNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int avgSum = 0;
        int count = 0;
        while (a != 0) {
            avgSum += a;
            a = sc.nextInt();
            count++;
        }
        System.out.println((double) avgSum/count);
    }
}

/*
Пользователь с клавиатуры вводит действительные числа до 0.
Необходимо вычислить их среднее арифметическое. Гарантируется, что он введёт хотя бы одно ненулевое число.

Sample Input:
1
2
3
0
Sample Output:
2.0
 */