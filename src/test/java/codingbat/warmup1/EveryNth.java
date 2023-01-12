package codingbat.warmup1;

public class EveryNth {
    public static String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
    }
}
