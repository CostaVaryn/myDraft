package stepik.introductory.scanner.cycles;

import java.util.Scanner;

public class WhileHashNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int count = 0;
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if(a % 11 == 0)
                x = a;
            count++;
            if(x % 3 == 0)
                y += x;
        }
        System.out.println(count-1);
        System.out.print(y - x);
    }
}

/**
 * На вход подаётся последовательность слов. Посчитайте общее количество введённых слов.
 * Примечание. Так как маркер конца последовательности в этой задаче отсутствует,
 * будет удобно воспользоваться методом hasNext().
 *
 * Sample Input:
 * Java
 * Python
 * C++
 * Go
 * PHP
 *
 * Sample Output:
 * 5
 */