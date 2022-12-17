package books.leonardtasks.chapter1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates3 {
    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();
        for (char c: chArray) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("ad block pls ad wir"));
    }
}
