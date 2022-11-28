package stepik.javabasics.languagebasics.problemsolving;

import java.util.Scanner;

public class SumOfNumbersEndingIn7or3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        int sum = 0;
        for (;a <= b; a++) {
            if (a % 10 == 3 || a % 10 == 7) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}

/*
С клавиатуры вводятся 2 числа: a и b соответственно.
Необходимо найти сумму всех чисел от a до b включительно, заканчивающихся на 3 или 7.

Sample Input:
10
30
Sample Output:
80
 */