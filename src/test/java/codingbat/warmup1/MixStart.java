package codingbat.warmup1;

public class MixStart {
    public static boolean mixStart(String str) {
        return str.startsWith("ix", 1);

        /*
        if (str.length() < 3) return false;
        String two = str.substring(1, 3);
        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
         */

    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }
}
