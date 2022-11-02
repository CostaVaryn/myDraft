package stepik.javabasics.objectorientedprogramming.exceptionhandling;

import java.util.Scanner;

public class SimpleCalcEx {
    static public void main (String []args) throws Exception{
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine();
        sc.close();
        double a = 0.0;
        double b = 0.0;
        char symbol = ' ';
        int count = 0;
        boolean is = true;
        for (String num : line.split(" ")) {
            count++;
            if (count == 1) {
                try {
                    a = Double.valueOf(num);
                }
                catch (NumberFormatException e) {
                    System.out.print("Error! Not number\n");
                    is = false;
                    break;
                }
            }
            if (count == 3) {
                try {
                    b = Double.valueOf(num);
                }
                catch (NumberFormatException e) {
                    System.out.print("Error! Not number\n");
                    is = false;
                    break;
                }
            }
        }
        if (is) {
            count = 0;
            for (String num: line.split(" ")) {
                count++;
                if(count == 2) {
                    try {
                        symbol = result(num, symbol);
                    }
                    catch (Exception s) {
                        System.out.print("Operation Error!");
                        is = false;
                        break;
                    }
                }
            }
        }
        if (is) {
            switch (symbol){
                case('+'): System.out.print(a + b);
                    break;
                case('-'): System.out.print(a - b);
                    break;
                case('/'):
                    if (b == 0.0) {
                        System.out.print("Error! Division by zero");
                    } else {
                        System.out.print(a / b);
                    }
                    break;
                case('*'): System.out.print(a * b);
                    break;
            }
        }

    }
    public static char result(String str, char sym) throws Exception {
        if (str.equals("/") || str.equals("*") || str.equals("+") || str.equals("-")) {
            sym = str.charAt(0);
            return sym;
        } else throw new Exception("OperationError");
    }
}

/*
Пользователь вводит одну строку, в которой должно быть записано
простое арифметическое выражение вида "a <операция> b", где a и b - какие-то действительные числа,
а операция - один из символов "+", "-", "*", "/". Ваша задача - выполнить вычисление, если это возможно.
Гарантируется, что в введённой строке ровно 2 пробела (значение пробел значение пробел значение)
В результате работы могут произойти различные ошибки. Их нужно обработать следующим образом:

Если одно из чисел не является числом, то вывести на экран "Error! Not number"
Если вместо знака операции было введено любое другое значение, то выведите "Operation Error!"
Если произошла попытка деления на ноль, то выведите на экран "Error! Division by zero"
Обрабатывать исключения необходимо в указанном выше порядке.

Sample Input 1:
35 + 14
Sample Output 1:
49.0

Sample Input 2:
123 - 34r
Sample Output 2:
Error! Not number
 */