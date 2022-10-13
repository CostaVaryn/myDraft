package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class Repetition1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (count < n) {
            int a = sc.nextInt();
            sum += a;
            count++;
        }
        System.out.println(sum);
    }
}

/*
Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.

Sample Input:
3
7
2
9
Sample Output:
18
 */