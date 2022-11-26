package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            //String str = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9' ]", "");
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            for (int j = 0; j < arr.length; j++) {
                hashSet.add(arr[j]);
            }
        }
        sc.close();
        System.out.println(hashSet.size());
    }
}

/*
Дан текст: в первой строке записано число строк, далее идут сами строки.
Определите, сколько различных слов содержится в этом тексте.

Словом считается последовательность непробельных символов идущих подряд,
слова разделены одним или большим числом пробелов или символами конца строки.

Sample Input:
4
She sells sea shells on the sea shore;
The shells that she sells are sea shells I'm sure.
So if she sells sea shells on the sea shore,
I'm sure that the shells are sea shore shells.

Sample Output:
19
 */