package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class AgainAmount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

/*
Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.

Sample Input:
1
3
Sample Output:
6
 */