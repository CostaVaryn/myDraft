package books.leonardtasks.chapter1;

public class IsPalindrome2 {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "madom";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
}
