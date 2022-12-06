package stepik.ProgrammingWorkshop.tasks2.iotasks1;

import java.util.Scanner;

public class NextAndPrevious {
    private void run(int a) {
        System.out.printf("The next number for the number %d is %d.\n", a, a + 1);
        System.out.printf("The previous number for the number %d is %d.\n", a, a - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        new NextAndPrevious().run(a);
    }
}

/*
Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере.
Пробелы, знаки препинания, заглавные и строчные буквы важны!

Входные данные
Вводится целое число, по модулю не превосходящее 10000.

Выходные данные
Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ", окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела. Аналогично в следующей строке для предыдущего числа.

Sample Input:
179

Sample Output:
The next number for the number 179 is 180.
The previous number for the number 179 is 178.
 */