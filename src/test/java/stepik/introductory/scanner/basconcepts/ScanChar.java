package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(), str2 = sc.next();
        System.out.println(str1.charAt(0) < str2.charAt(0));

        int x = 5, y = 3;
        int z = ++x;
        y += x--;
        z+= --x + y++;
        System.out.println(x + y + z);
    }
}
