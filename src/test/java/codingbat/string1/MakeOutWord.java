package codingbat.string1;

public class MakeOutWord {
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(out.length() - 2);
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}
