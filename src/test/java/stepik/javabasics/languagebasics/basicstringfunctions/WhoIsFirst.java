package stepik.javabasics.languagebasics.basicstringfunctions;

import java.util.Scanner;

public class WhoIsFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String symbol = sc.next();
        sc.close();
        System.out.println(str.indexOf(symbol));
        System.out.println(str.lastIndexOf(symbol));
    }
}

/*
Дана строка, в которой через пробел перечислены цифры.
На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.

Sample Input:
4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
4
Sample Output:
0
28
 */