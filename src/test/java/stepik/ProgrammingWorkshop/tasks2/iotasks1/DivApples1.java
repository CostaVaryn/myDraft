package stepik.ProgrammingWorkshop.tasks2.iotasks1;

import java.util.Scanner;

public class DivApples1 {
    private void run(int n, int k) {
        int res = 0;
        for (int i = 0; i <= k; i++) {
            if (i % n == 0) {
                res = i;
            }
        }
        System.out.println(res / n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        new DivApples1().run(n, k);
    }
}

/*
N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок достанется каждому школьнику?

Входные данные
Программа получает на вход числа N и K.
Выходные данные
Программа должна вывести искомое количество яблок.

Sample Input:
5
21

Sample Output:
4
 */