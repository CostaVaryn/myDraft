package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class RemoveExcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String str = sc.nextLine().replaceAll("[^A-Za-zА-Яа-я0-9 ]", "");
        //System.out.println(str);

        char[] a = sc.nextLine().toCharArray();
        sc.close();
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i]) || Character.isLetter(a[i]) || a[i]==' ') {
                System.out.print(a[i]);
            }
        }
    }
}

/*
Вводится строка. уберите из неё все символы, которые не являются ни цифрой, ни буквой, ни пробелом.

Sample Input:
Привет, это предложение, в котором %есть лишние ;символы. 45
Sample Output:
Привет это предложение в котором есть лишние символы 45
 */