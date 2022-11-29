package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class Repetition2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int count = 0;
        while (s < n) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                count++;
            }
            s++;
        }
        sc.close();
        System.out.println(count);
    }
}
/*
Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел.
Необходимо найти и вывести на экран количество чётных.

Sample Input:
3
7
2
9
Sample Output:
1
 */