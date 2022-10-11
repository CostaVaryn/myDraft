package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int p = 1;
        if (n == 1) {
            System.out.print("1" + " " + sc.nextInt());
        } else {
            while (p < n) {
                s++;
                int k = sc.nextInt();
                p = p * k;

            }
            System.out.print(s + " " + p);
        }
    }
}

/*
Программа запрашивает натуральное число n.
Необходимо составить программу, которая будет считывать целые числа до тех пор,
пока их произведение не станет больше либо равна n.
Выведите через пробел количество введенных чисел и их произведение.

Примечание: подумайте, что произойдёт, если n равно 1.

Sample Input 1:
8
1
5
3
4
2
7
19
Sample Output 1:
3 15
Sample Input 2:
100
-2
-1
5
10
3
Sample Output 2:
4 100
 */