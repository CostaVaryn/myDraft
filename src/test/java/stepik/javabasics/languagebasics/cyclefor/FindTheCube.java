package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class FindTheCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_0 = false;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("Куб")) {
                is_0 = true;
                continue;
            }
            if (str.equals("СТОП")) {
                break;
            }
        }
        sc.close();
        if (is_0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Пользователь вводит слова до тех пор, пока не введёт "СТОП". Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите "YES", если нет, то  "NO".

Sample Input:
Привет
Я
люблю
рисовать
круги
и
Куб
Это
Прикольно)
СТОП
Sample Output:
YES
 */