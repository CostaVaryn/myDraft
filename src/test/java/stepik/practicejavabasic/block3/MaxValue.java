package stepik.practicejavabasic.block3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] arrStr = str.replaceAll("0","").split(" ");
        Arrays.sort(arrStr);
        System.out.println(arrStr[arrStr.length - 1]);
    }
}

/*
Напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и выводит максимальное из них.

Подробности:
Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее элементом.
Последовательность гарантированно содержит хотя бы одно значение.

Sample Input:
2 4 6 9 2 4 5 0
Sample Output:
9
 */