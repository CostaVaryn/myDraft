package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class Only7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_0 = false;
        while(sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("Куб")) {
                is_0 = true;
                continue;
            }
            if (str.equals("СТОП")) {
                break;
            }
        }
        if (is_0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Напишем программу, которая считывает целые числа с клавиатуры и находит их сумму, если они заканчиваются на 7.
Если ввели число, кратное 7, то программа должна завершиться (оно не суммируется).
Во время решения задачи воспользуемся break и continue.

Sample Input:
1
2
17
27
14
37
45
12
Sample Output:
44
 */