package codingbat.warmup1;

public class BackAround {
    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }
}
