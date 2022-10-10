package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class NumberOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            int exA = a;
            a = sc.nextInt();
            if (exA < a) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Последовательность состоит из натуральных чисел и завершается числом 0.
Определите, сколько элементов этой последовательности больше предыдущего элемента.
Гарантируется ввод хотя бы двух ненулевых чисел.

Числа, следующие за числом 0, считывать не нужно.

Sample Input:
8
11
21
0
Sample Output:
2
 */