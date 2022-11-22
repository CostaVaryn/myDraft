package stepik.introductory.scanner.constractions;

import java.util.Arrays;
import java.util.Scanner;

public class ScanAlphabetOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        Arrays.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
        sc.close();


        /*
        if (s1 > s2 && s1 > s3 && s2 > s3) {
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
        } else if (s2 > s1 && s2 > s3 && s1 > s3) {
            System.out.println(str2);
            System.out.println(str1);
            System.out.println(str3);
        } else if (s3 > s1 && s3 > s2 && s2 > s1) {
            System.out.println(str3);
            System.out.println(str2);
            System.out.println(str1);
        } else if (s3 > s1 && s3 > s2 && s1 > s1) {
            System.out.println(str3);
            System.out.println(str1);
            System.out.println(str2);
        } else if (s1 > s2 && s1 > s3 && s3 > s2) {
            System.out.println(str1);
            System.out.println(str3);
            System.out.println(str2);
        } else if (s2 > s1 && s2 > s3 && s3 > s1) {
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str1);
        } else {
            System.out.println("false");
        }*/
    }
}
