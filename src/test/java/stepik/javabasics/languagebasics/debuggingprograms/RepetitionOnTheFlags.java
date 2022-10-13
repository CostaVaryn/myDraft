package stepik.javabasics.languagebasics.debuggingprograms;

import java.util.Scanner;

public class RepetitionOnTheFlags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean is_0 = false;
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                if ((a % 10 == 4) || (a == 4)) {
                    is_0 = true;
                }
            }
        if (is_0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


/*
Вводится количество чисел n, затем n чисел.
Необходимо выяснить есть ли среди них такое, которое заканчивается на 4?
Если такое число имеется среди введённых выведите на экран слово "Yes", иначе "No".

Sample Input:
5
21
32
45
64
98
Sample Output:
Yes
 */