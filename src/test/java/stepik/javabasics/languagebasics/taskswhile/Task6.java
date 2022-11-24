package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            count += a;
            a = sc.nextInt();
        }
        sc.close();
        System.out.println(count);
    }
}

/*
Пользователь вводит натуральные числа по одному на каждой строке.
Когда ему надоедает, то он вводит 0. Найти сумму введенных чисел (0 не считается)

Sample Input 1:
10
2
5
5
0
Sample Output 1:
22
Sample Input 2:
3
2
1
0
Sample Output 2:
6
 */