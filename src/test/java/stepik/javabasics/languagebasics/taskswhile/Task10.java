package stepik.javabasics.languagebasics.taskswhile;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        while (num < n) {
            num++;
            for (int s = 0; s < (n - num); s++) {
                System.out.print(" ");
            }
            for (int i = 0; i % 2 == 0; i++) {
                System.out.print("*");
            }
            for (int dub = 1; dub < num; dub++) {
                System.out.print("**");
            }
            System.out.println();
        }
    }
}

/*
Вводятся натуральное число n. Выведите на экран пирамидку, состоящую из n слоёв.

Sample Input 1:
5
Sample Output 1:
    *
   ***
  *****
 *******
*********

Sample Input 2:
3
Sample Output 2:
  *
 ***
*****
 */