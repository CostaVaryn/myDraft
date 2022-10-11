package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            a = sc.nextInt();
            count++;
        }
        System.out.println(count);
    }
}

/*
Пользователь вводит натуральные числа по одному на каждой строке.
Когда ему надоедает, то он вводит 0.
Найти количество введенных чисел (0 не считается)

Sample Input 1:
8
5
1
4
9
9
0
Sample Output 1:
6
Sample Input 2:
10
2
23
0
Sample Output 2:
3
 */