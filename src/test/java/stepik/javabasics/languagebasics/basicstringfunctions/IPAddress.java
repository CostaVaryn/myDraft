package stepik.javabasics.languagebasics.basicstringfunctions;

import java.util.Scanner;

public class IPAddress {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("\\.");
        sc.close();
        boolean isTrue = true;
        for (int i = 0; i < str.length; i++) {
            if (str.length <= 3 || str.length >= 5) {
                isTrue = false;
                break;
            }
            if (str[i].isEmpty()) {
                isTrue = false;
                break;
            }
            int b = Integer.parseInt(str[i]);
            if (b < 0 || b > 255) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        //String ip = sc.next();
        //String regex = "^(([1][0-9]{2}|[2][0-4][0-9]|[2][5][0-5]|[0-9]{1,2})[.]){3}([1][0-9]{2}|[2][0-4][0-9]|[2][5][0-5]|[0-9]{1,2})$";
        //System.out.print(ip.matches(regex)?"YES":"NO");
    }
}

/*
Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес.
Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками.
В следующих трех строках показаны три правильных IP-адреса:

127.0.0.0
192.168.0.01
255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
Входные данные
На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.

Выходные данные
Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

Примечание:
У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:

String s = ".";
просто на просто не сработает. Точнее сработает неверно.
Для корректного создания строки, содержащей точку используйте экранирование.

String s = "\\.";

Sample Input 1:
192.168.1.2
Sample Output 1:
YES

Sample Input 2:
192.11.690.0
Sample Output 2:
NO

Sample Input 3:
67.67.67
Sample Output 3:
NO
 */