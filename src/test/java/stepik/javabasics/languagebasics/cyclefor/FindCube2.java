package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class FindCube2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_0 = false;
        int count = 0;
        int numCube = 0;
        for(String i = sc.nextLine(); !(i.equals("СТОП")); i = sc.nextLine()){
            if(!(i.equals("потом")) && !(i.equals("ээээ"))) {
                count++;
                if(i.equals("Куб")) {
                    numCube = count;
                    is_0 = true;
                }
            }
        }
        System.out.println((is_0) ? numCube : "NO");
    }
}

/*
Пользователь вводит слова до тех пор, пока не введёт "СТОП".
Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом".
Слова-паразиты не считаются нормальными словами.

Необходимо выяснить, было ли среди введённых слов слово "Куб".
Если да, то выведите, каким по счёту нормальным словом оно было введено.
В противном случае выведите на экран слово "NO".

Sample Input 1:
Привет
ээээ
Я
люблю
рисовать
круги
и
Куб
Это
Прикольно)
СТОП
Sample Output 1:
7

Sample Input 2:
Привет
ээээ
Я
потом
ээээ
в
Куб
СТОП
Sample Output 2:
4
 */