package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a <= b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else {
            while (a >= b) {
                System.out.println(a);
                a--;
            }
        }
    }
}

/*
Вводятся два целых числа a и b. Выведите на экран все числа от a до b включительно.

Sample Input 1:
3
7
Sample Output 1:
3
4
5
6
7
Sample Input 2:
1
-2
Sample Output 2:
1
0
-1
-2
 */