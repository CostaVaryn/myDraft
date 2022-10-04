package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt();
        System.out.println((x%10)+n);
    }
}

/*
Робот ВАЛЛ-И любит играть в такую игру: он называет натуральное число,
а ЕВА берет последнюю цифру этого числа и увеличивает на n. Какое число получила ЕВА?

Входные данные:
программа получает на вход два натуральных числа:
x - число, которое загадывает ВАЛЛ-И
n - на сколько увеличивается последняя цифра
Выходные данные:
выведите ответ на задачу

Sample Input 1:
811
2
Sample Output 1:
3
Sample Input 2:
315689
10
Sample Output 2:
19
 */