package codingbat.string1;

public class ExtraEnd {
    public static String extraEnd(String str) {
        String last = str.substring(str.length() - 2);
        return last + last + last;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }
}
