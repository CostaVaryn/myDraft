package codingbat.warmup1;

public class NearHundred {
    public static boolean nearHundred(int n) {
        return (n > 89 && n < 111 || n < 211 && n > 189);
        // return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }
}
