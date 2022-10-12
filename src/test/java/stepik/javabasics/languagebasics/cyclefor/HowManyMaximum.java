package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class HowManyMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int sum = 1;
        for (int a = sc.nextInt(); a >= 0; a = sc.nextInt()) {

            if (a == 0) {
                break;
            } else if (a > max) {
                sum = 1;
                max = a;
            } else if (a == max) {
                ++sum;
            }
        }
        System.out.print(sum);
    }
}

/*
Последовательность состоит из натуральных чисел и завершается числом 0.
Всего вводится не более 10000 чисел (не считая завершающего числа 0).
Определите, сколько элементов этой последовательности равны ее наибольшему элементу.

Числа, следующие за числом 0, считывать не нужно.

Sample Input:
1
2
4
5
2
5
3
0
Sample Output:
2
 */