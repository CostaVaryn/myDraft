package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n = sc.nextInt();
        sc.close();
        System.out.println(t * (n - 1));
    }
}

/*
ВАЛЛ-И, катаясь на лифте, заметил, что между двумя соседними этажами он проезжает за t секунд. Составьте программу,
помогающую ВАЛЛ-И рассчитать, за сколько секунд он поднимется на этаж с номером n.

Входные данные:
программа получает на вход два натуральных числа:
t - время в секундах, за которое лифт поднимается на один этаж
n - номер этажа, на который надо подняться ВАЛЛ-И

Выходные данные:
выведите ответ на задачу

Sample Input 1:
2
5
Sample Output 1:
8
Sample Input 2:
5
2
Sample Output 2:
5
 */