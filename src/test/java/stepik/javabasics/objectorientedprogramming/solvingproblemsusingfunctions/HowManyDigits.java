package stepik.javabasics.objectorientedprogramming.solvingproblemsusingfunctions;

import java.util.Scanner;

public class HowManyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(digit_count(s));
    }
    static String digit_count(String s) {
        return String.valueOf(s.replaceAll("[^0-9]", "").length());
    }
}

/*
Дана строка, содержащая цифры и английские буквы (большие и маленькие).
Напишите функцию digit_count, которая найдёт количество цифр в этой строке.

Входные данные
Вводится строка ненулевой длины. Известно также, что длина строки не превышает 1000 знаков.

Выходные данные
Выведите количество цифр, которые присутствуют в строке.

Содержание функции main менять запрещено.

Sample Input:
aifun3eIYFI2bisdb45YFybjyFVUVYFV113
Sample Output:
7
 */