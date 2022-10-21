package stepik.javabasics.objectorientedprogramming.returnrecursion;

import java.util.Scanner;

public class FormatPhoneNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        format_number(number);
    }
    static void format_number(String str) {
        if (str.length() != 11) {
            System.out.println("Неверное число символов");
            return;
        }
        if (!str.matches("\\d{11}")) {
            System.out.println("Не все символы являются цифрами");
            return;
        }
        if (!str.startsWith("8")) {
            System.out.println("Это не российский номер телефона");
            return;
        }
        char[] chars = str.toCharArray();
        StringBuilder nums = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            nums.append(chars[i]);
            if (i == 0) {
                nums.append(" (");
            }
            if (i == 3) {
                nums.append(") ");
            }
            if (i == 6 || i == 8) {
                nums.append("-");
            }
        }
        System.out.println(nums);
    }
}

/*
Напишите функцию format_number, которая будет принимать в качестве аргумента строку,
которая должна содержать телефонный номер. И выводить его по образцу: 8 (987) 654-32-10.

Телефонный номер должен состоять ровно из 11 цифр.
Если в введённой строке больше или меньше символов, то функция должна вывести на экран "Неверное число символов".
Если в номере встретится хотя бы один символ, который не является цифрой,
то функция должна вывести на экран "Не все символы являются цифрами"
Российские номера начинаются только с 8 (для простоты задачи).
Если номер начинается не с 8, то функция должна вывести на экран "Это не российский номер телефона"
Если с номером всё в порядке, то функция должна вывести на экран номер телефона по указанному выше образцу.
Содержание функции main менять запрещено.

Примечание: проверка условий должна выполняться в том же порядке, что и перечисленные выше условия.
То есть, если в строке и не 11 символов и присутствует буква, то программа должна вывести: "Неверное число символов".

Sample Input 1:
89876543210
Sample Output 1:
8 (987) 654-32-10

Sample Input 2:
8987654321
Sample Output 2:
Неверное число символов

Sample Input 3:
8987654321q
Sample Output 3:
Не все символы являются цифрами

Sample Input 4:
69876543210
Sample Output 4:
Это не российский номер телефона
 */