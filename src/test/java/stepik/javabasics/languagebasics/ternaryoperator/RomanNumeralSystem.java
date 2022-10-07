package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class RomanNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        String[] romanOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] romanDecs = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] romanCents = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "MC" };
        int ones = num % 10;
        num /= 10;
        int dec = num % 10;
        num /= 10;
        int cents = num % 10;
        String result = romanCents[cents].concat(romanDecs[dec]).concat(romanOnes[ones]);
        System.out.println(result);
    }
}

/*
Дано число X. Требуется перевести это число в римскую систему счисления.

Входные данные
Дано число X в десятичной системе счисления (1  ≤  X  ≤  100).

Выходные данные
Выведите X в римской системе счисления.

Sample Input 1:
4
Sample Output 1:
IV
Sample Input 2:
13
Sample Output 2:
XIII
Sample Input 3:
54
Sample Output 3:
LIV
 */