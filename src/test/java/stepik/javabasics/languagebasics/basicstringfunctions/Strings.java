package stepik.javabasics.languagebasics.basicstringfunctions;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length() - 2));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,str.length() - 2));
        System.out.println(str.substring(3));
        System.out.println(str.length());
    }
}

/*
Дана строка.

Сначала выведите третий символ этой строки.
Во второй строке выведите предпоследний символ этой строки.
В третьей строке выведите первые пять символов этой строки.
В четвертой строке выведите всю строку, кроме последних двух символов.
На пятой строке выведите всю строку, кроме первых 3 символов.
На шестой строке выведите длину данной строки.

Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов.

Sample Input:
ABCDEFGHI
Sample Output:
C
H
ABCDE
ABCDEFG
DEFGHI
9
 */