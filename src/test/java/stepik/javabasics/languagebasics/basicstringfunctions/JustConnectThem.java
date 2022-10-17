package stepik.javabasics.languagebasics.basicstringfunctions;

import java.util.Scanner;

public class JustConnectThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        String hyphen = sc.next();
        String result = String.join(hyphen, str);
        System.out.println(result);
    }
}

/*
Вводится число n, затем n строчек, которые необходимо соединить.
После вводится ещё одна строка - которая должна быть в качестве разделителя.
Выведите одну строку - все введённые выше слова через разделитель.

Sample Input:
5
Привет
это
курсы
по
Java
-
Sample Output:
Привет-это-курсы-по-Java
 */