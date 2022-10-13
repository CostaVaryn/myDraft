package stepik.javabasics.languagebasics.arrays;

import java.util.Scanner;

public class SimpleArrayProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int multiply = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] * multiply);
        }
    }
}

/*
Вводится число n, затем n чисел целых, по одному на каждой строке.
Затем вводится число, на которое нужно умножить все введённые выше числа.
Выведите на экран результат умножения построчно.

Sample Input:
4
1
2
3
5
2
Sample Output:
2
4
6
10
 */