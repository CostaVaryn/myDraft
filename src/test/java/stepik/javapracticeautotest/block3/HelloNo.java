package stepik.javapracticeautotest.block3;

import java.io.IOException;
import java.util.Scanner;

public class HelloNo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count < 0) {
            System.out.println("Серьезно? А что так негативно?");
        } else if (count == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else {
            String[] arrStr = new String[count];
            for(int i = 0; i < arrStr.length; i++) {
                arrStr[i] = sc.next();
                System.out.println("Привет, " + arrStr[i]);
            }
        }
    }
}

/*
Напишите простую программу:
которая запрашивает количество незнакомцев, с которыми нужно встретиться и их имена перечисленные через пробел
построчно выводит: "Привет, (имя незнакомца)" для каждого незнакомца.
Гарантируется, что введенное количество незнакомцев — целое число.

Частные случаи:
Если количество незнакомцев равно нулю, программа должна вывести: "Оу... Похоже здесь никого...".
Если количество незнакомцев отрицательное, программа должна вывести: "Серьезно? А что так негативно?".

Sample Input 1:
-1
Sample Output 1:
Серьезно? А что так негативно?

Sample Input 2:
3
Sample Output 2:
Oleg Pavel Adam
 */