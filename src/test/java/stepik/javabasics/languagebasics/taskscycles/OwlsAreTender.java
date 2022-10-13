package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class OwlsAreTender {
    public static void main(String[] args) {
        String str1 = ":)\\_____/(:";
        String str2 = " {(@)v(@)}";
        String str3 = " {|~- -~|}";
        String str4 = " {/^'^'^\\}";
        String str5 = " ===m-m===";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);
            System.out.println(str5);
            System.out.println();
        }
    }
}

/*
Напишите программу, которая по введенному с клавиатуры числу выводит соответствующее число сов.
Картинка тетушки Совы состоит из символов. Размер одной картинки 5 на 11 символов.

:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===
Между двумя соседними совами имеется пустая строка.

Входные данные
Задано целое неотрицательное число n.

Sample Input:
2
Sample Output:
:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===

:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===
 */