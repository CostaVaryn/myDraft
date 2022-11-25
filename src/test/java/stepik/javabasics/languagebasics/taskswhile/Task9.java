package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = 0;
        while (num < n) {
            num++;
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Вводятся натуральное число n. Выведите на экран лесенку, состоящую из n ступенек.
Каждая i-ая ступенька состоит из i звёздочек.

Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****
Sample Input 2:
3
Sample Output 2:
*
**
***
 */