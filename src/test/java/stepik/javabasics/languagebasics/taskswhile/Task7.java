package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sumX = 0;
        while (sumX < n) {
            sumX += x;
        }
        System.out.println(sumX);
    }
}

/*
Программа запрашивает два числа: n и x.
Необходимо составить программу, которая будет прибавлять число x само к себе до тех пор,
пока сумма не станет больше либо равна n. Выведите полученную сумму.

Sample Input 1:
8
3
Sample Output 1:
9
Sample Input 2:
100
5
Sample Output 2:
100
 */