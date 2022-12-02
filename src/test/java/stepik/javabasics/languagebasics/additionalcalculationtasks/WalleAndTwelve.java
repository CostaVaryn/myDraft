package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        sc.close();
        System.out.println(n * d);
    }
}

/*
ВАЛЛ-И за 1 день выучивает n иностранных слов. Составьте программу, которая рассчитает,
сколько иностранных слов выучит робот за d дней.

Входные данные:
n - количество слов
d - количество дней
Выходные данные:
выведите ответ на задачу

Sample Input 1:
8
3
Sample Output 1:
24
Sample Input 2:
10
10
Sample Output 2:
100
 */
