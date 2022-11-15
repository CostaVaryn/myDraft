package stepik.practicejavabasic.block2;

import java.util.Scanner;

public class MiniDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int sec = s % 60;
        int min = (s / 60) % 60;
        int hours = (s / 60) / 3600;

        String strSec = (sec < 10) ? "0" + Integer.toString(sec) : Integer.toString(sec);
        String strMin = (min < 10) ? "0" + Integer.toString(min) : Integer.toString(min);
        String strHours = (hours < 10) ? "" + Integer.toString(hours) : Integer.toString(hours);

        System.out.println(strHours + ":" + strMin + ":" + strSec);
    }
}
