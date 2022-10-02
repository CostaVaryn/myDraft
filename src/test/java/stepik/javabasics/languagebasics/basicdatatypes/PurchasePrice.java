package stepik.javabasics.languagebasics.basicdatatypes;

import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() * 100;
        int b = sc.nextInt() + a;
        int n = sc.nextInt();
        System.out.printf("%d %d", ((b * n) - ((b * n) % 100)) / 100, (b * n) % 100);
    }
}

/*
Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
Программа получает на вход три числа: a, b, n.
Программа должна вывести два числа: стоимость покупки в рублях и копейках.

Sample Input 1:
10 15 2
Sample Output 1:
20 30
Sample Input 2:
2 50 4
Sample Output 2:
10 0
 */