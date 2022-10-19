package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.HashMap;
import java.util.Scanner;

public class SynonymDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> synonyms = new HashMap<String, String>();
        int n = sc.nextInt();
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < n; i++) {
            str1 = sc.next();
            str2 = sc.next();
            synonyms.put(str1, str2);
            synonyms.put(str2, str1);
        }
        String word = sc.next();
        for (String key : synonyms.keySet()) {
            if (word.equalsIgnoreCase(synonyms.get(key))) {
                System.out.println(key);
            }
        }

    }
}

/*
Вам дан словарь, состоящий из пар слов.
Каждое слово является синонимом к парному ему слову.
Все слова в словаре различны.

Для слова из словаря, записанного в последней строке, определите его синоним.

Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести.

Sample Input:
3
Hello
Hi
Bye
Goodbye
List
Array
Goodbye
Sample Output:
Bye
 */