package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class Squares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int num = 1;
        while (num*num <= i) {
            System.out.println(num*num);
            num++;
        }
    }
}

/*
Пользователь вводит натуральное число.
Необходимо вывести все полные квадраты натуральных чисел, не превосходящие этого числа.

Sample Input:
17
Sample Output:
1
4
9
16
 */