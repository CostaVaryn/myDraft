package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class ScanOneSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), n = sc.next();
        int val = str.length();
        if (str.contains(n) || val > 20) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}

/**
 * На вход подаётся строка, а затем - одна буква.
 * Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES", в противном случае - "NO".
 *
 * Sample Input:
 * This is a string
 * a
 *
 * Sample Output:
 * YES
 */