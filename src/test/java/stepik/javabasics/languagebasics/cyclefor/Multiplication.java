package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multi = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("СТОП")) {
                break;
            }
            int num = Integer.parseInt(str);
            if ((num != 0) && (multi != 0)) {
                multi *= num;
            } else if (num != 0) {
                multi += num;
            }
        }
        sc.close();
        System.out.print((multi != 0) ? multi : "Не найдено");
    }
}

/*
Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".

Для того, чтобы превратить String в другой тип данных используйте конструкцию подобную этой:

String s = "45";
int n = Integer.parseInt(s); //в переменной n окажется число 45

Sample Input:
3
0
2
4
СТОП
Sample Output:
24
 */