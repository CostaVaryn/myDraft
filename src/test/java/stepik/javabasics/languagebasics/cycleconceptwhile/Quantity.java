package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class Quantity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        int count = 0;
        while (a <= b) {
            if ((a % 3 == 0) && (a % 5 != 0)) {
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
}

/*
Вводится 2 целых числа a и b (a <= b).
Необходимо вычислить количество всех чисел кратных 3, но не кратных 5 от а до b включительно.

Sample Input:
1 16
Sample Output:
4
 */