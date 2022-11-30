package stepik.javabasics.languagebasics.basicdatatypes;

import java.util.Scanner;

public class NumsAbs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int previous = a - 1;
        int next = a + 1;
        if (a >= 0 && Math.abs(a) < 10000) {
            System.out.println("The next number for the number " + a + " is " + next + ".");
            System.out.println("The previous number for the number " + a + " is " + previous + ".");
        }
    }
}

/*
Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере.
Пробелы, знаки препинания, заглавные и строчные буквы важны!
Вводится целое число, по модулю не превосходящее 10000.
Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ", окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела. Аналогично в следующей строке для предыдущего числа.

Sample Input 1:
179
Sample Output 1:
The next number for the number 179 is 180.
The previous number for the number 179 is 178.

Sample Input 2:
0
Sample Output 2:
The next number for the number 0 is 1.
The previous number for the number 0 is -1.
 */