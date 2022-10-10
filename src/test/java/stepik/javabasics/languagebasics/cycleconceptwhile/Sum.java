package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        int sum = 0;
        while (a <= b) {
            sum += a;
            a++;
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