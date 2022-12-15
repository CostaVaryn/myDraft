package books.leonardtasks.chapter1;

public class IsPalindrome3 {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "madom";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
}
