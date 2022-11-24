package stepik.javabasics.languagebasics;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SipmleSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
        int value;
        switch (count) {
            case 1:
                value = 12;
                break;
            case 2:
                value = 32;
                break;
            case 3:
                value = 52;
                break;
            default:
                value = 0;
        }
        System.out.println(value);
    }
}
