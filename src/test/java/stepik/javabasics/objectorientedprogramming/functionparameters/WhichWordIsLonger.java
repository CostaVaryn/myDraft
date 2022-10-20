package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class WhichWordIsLonger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }
    static void twoWords(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println("Первая строка длиннее");
        } else {
            System.out.println(str1.length() == str2.length() ? "Равная длина" : "Вторая строка длиннее");
        }
    }
}

/*
Напишите функцию twoWords, которая принимает две строки и сравнивает их длины.
После чего выводит на экран либо "Первая строка длиннее", либо "Вторая строка длиннее", либо "Равная длина".
Содержание функции main менять запрещено.

Sample Input:

Привет!
Пока(
Sample Output:

Первая строка длиннее
 */