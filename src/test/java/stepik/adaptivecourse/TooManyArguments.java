package stepik.adaptivecourse;

import java.util.Scanner;

public class TooManyArguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = s.replaceAll("[^A-Za-zА-Яа-я.]", "").toLowerCase();
        System.out.println(res);
        sc.close();
    }
}
