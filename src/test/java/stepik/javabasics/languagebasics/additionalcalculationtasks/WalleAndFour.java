package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 3
        int t = sc.nextInt(); // 500
        int k = sc.nextInt(); // 30
        int n = sc.nextInt(); // 2
        sc.close();
        int sumTea = (t / 100) * x;
        int sumPir = x * n * k;
        System.out.println(sumPir+sumTea);
    }
}

/*
ВАЛЛ-И решил отметить день рождения и пригласил x друзей.
На каждого гостя ему необходимо приготовить 10 грамм заварки и по n пирожному.
Килограмм чая на развес стоит t рублей, а одно пирожное - k рублей.
Во сколько обойдется ВАЛЛ-И чаепитие? Гарантируется, что все числа в решения задачи окажутся целыми.

Входные данные:
Вводятся 4 целых неотрицательных числа:

x - количество приглашенных друзей
t - стоимость килограмма чая
k - стоимость одного пирожного
n - количество пирожных
Выходные данные:
выведите одно целое число - ответ на задачу.

Sample Input:
3
500
30
2
Sample Output:
195
 */
