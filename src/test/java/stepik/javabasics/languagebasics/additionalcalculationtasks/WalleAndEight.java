package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        sc.close();
        System.out.println(k / n + " " + k % n);
    }
}

/*
ВАЛЛ-И встретил n детей и хочет разделить между ними k яблок так, чтобы каждому досталось поровну.
Не делящийся остаток он собирается отнести ЕВЕ. Сколько яблок достанется каждому ребенку? Сколько яблок получит ЕВА?

Результат выведите в одной строке через пробел в указанном порядке.

Входные данные:
два натуральных числа:
n - количество детей
k - количество яблок

Выходные данные:
выведите ответ на задачу

Sample Input 1:
2
6
Sample Output 1:
3 0
Sample Input 2:
4
25
Sample Output 2:
6 1
 */