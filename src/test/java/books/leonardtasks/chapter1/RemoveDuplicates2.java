package books.leonardtasks.chapter1;

public class RemoveDuplicates2 {
    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray(); // или использовать charAt(i)
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("ad block pls ad wir"));
    }
}
