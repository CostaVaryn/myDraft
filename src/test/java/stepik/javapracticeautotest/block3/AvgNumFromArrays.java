package stepik.javapracticeautotest.block3;

import java.util.Arrays;
import java.util.Scanner;

public class AvgNumFromArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] arrStr = str.replaceAll("0","").split(" ");
        Arrays.sort(arrStr);
        System.out.println(arrStr[(arrStr.length - 1) / 2]);
    }
}

/*
Напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и находит среднее значение.

Подробности:

Вы должны считывать значения последовательности, пока следующее не станет 0.
Нулевое значение означает конец входной последовательности и не является ее частью.
Последовательность гарантированно содержит хотя бы одно значение.
Среднее значение также является целым числом. Используйте целочисленные операции.

Sample Input:
1 2 3 4 5 0
Sample Output:
3
 */