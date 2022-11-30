package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        int res = Math.max(a,Math.max(b,c));
        System.out.println(res);
    }
}

/*
Вводится 3 целых числа, выведите большее из них

Sample Input:
1 2 3
Sample Output:
3
 */
