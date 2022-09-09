package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanHomeClock {

    /**
     * Sample Input 1:
     * 41000
     * Sample Output 1:
     * 11:23:20
     *
     * Sample Input 2:
     * 3600
     * Sample Output 2:
     * 01:00:00
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value > 86400) {
            value -= 86400;
        }
        int s = value % 60;
        int m = (value % 3600) / 60;
        int h = (value % 86400) / 3600;
        String.valueOf(System.out.format("%02d" + ":" + "%02d" + ":" + "%02d\n", h, m, s));

        /**
         *          int h = value / 3600;
         *          int m = (value % 3600) / 60;
         *          int s = (value % 3600) % 60;
         *          System.out.printf("%02d" + ":" + "%02d" + ":" + "%02d", h, m, s);
         */

        /**
         *         int value = sc.nextInt();
         *         int hours = value/3600;
         *         int minutes = (value - (3600 * hours))/60;
         *         int seconds = value - (3600 * hours) - (60 * minutes);
         *         String.valueOf(System.out.format("%02d"+":"+"%02d"+":"+"%02d",hours,minutes,seconds));
         */

    }
}
