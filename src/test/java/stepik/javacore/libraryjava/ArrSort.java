package stepik.javacore.libraryjava;

import javax.management.ObjectName;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] arrStr = str.split(" ");
        Arrays.sort(arrStr);
        for(String s : arrStr) {
            System.out.print(s + " ");
        }
    }
}
