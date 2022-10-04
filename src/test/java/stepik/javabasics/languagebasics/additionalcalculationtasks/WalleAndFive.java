package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt();
        int sum = (h * 60) + m;
        System.out.println(sum);
    }
}

/*
ВАЛЛ-И хочет по электронным часам, показывающим часы и минуты,  узнать сколько времени в минутах прошло от начала суток.

Входные данные:
два числа: часы (0 <= h < 24) и минуты (0 <= m < 60)

Выходные данные:
время от начала суток в минутах

Sample Input 1:
2
45
Sample Output 1:
165

Sample Input 2:
12
30
Sample Output 2:
750
 */
