package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        double d = a + 3;
        System.out.println(d / 2);
    }
}

/*
Путешествуя, ВАЛЛ-И попал в логово к Дракону.
Чтобы остаться в живых ему надо угадать число, которое задумали его головы.
Первая голова называет любое целое число, вторая - увеличивает его на 3, а третья результат уменьшает в 2 раза.
Составьте программу, которая позволит ВАЛЛ-И безошибочно вычислять результат.

Входные данные:
на вход подается натуральное число

Выходные данные:
выведите ответ на задачу

Sample Input:
10
Sample Output:
6.5
 */