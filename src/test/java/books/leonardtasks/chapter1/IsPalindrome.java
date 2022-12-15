package books.leonardtasks.chapter1;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
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
