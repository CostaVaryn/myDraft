package stepik.javabasics.languagebasics.basicstringfunctions;

import java.util.Scanner;

public class HowManyWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char wordMasha = sc.next().charAt(0);
        char wordOleg = sc.next().charAt(0);
        int countOleg = 0;
        int countMasha = 0;
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            if (word.startsWith(String.valueOf(wordOleg)) && word.endsWith(String.valueOf(wordMasha))) {
                countOleg++;
            } else if (word.startsWith(String.valueOf(wordMasha)) && word.endsWith(String.valueOf(wordOleg))) {
                countMasha++;
            }
        }
        sc.close();
        System.out.println(countMasha);
        System.out.println(countOleg);
    }
}

/*
Маша и Олег играли в игру.
Маша читала статьи в газете и выписывала слова, которые начинаются на её любимую букву
и заканчиваются на любимую букву её друга Олега.
Олег же наоборот - слова, которые начинаются на его любимую букву и заканчиваются на любимую букву Маши.
Обратите внимание, что буквы могут быть в разных регистрах (большие/маленькие).
Определите, сколько слов выписали дети.

Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега.
Затем вводится строка, в которой перечислены слова, которые написаны в газете.

Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.

Sample Input:
а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:
2
3
 */