package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = (int) Math.pow(j,2);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/*
Вводится натуральное число n.
Допишите код, который создаст массив с именем array на n элементов,
в котором буду храниться квадраты чисел от 0 до n - 1 (элемент равен квадрату индекса).

Написанный код менять запрещено.

Sample Input 1:
5
Sample Output 1:
0 1 4 9 16
Sample Input 2:
3
Sample Output 2:
0 1 4
 */