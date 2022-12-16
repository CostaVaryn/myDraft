package books.leonardtasks.chapter1;

public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        char[] chArray = str.toCharArray();
        for (char c : chArray) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeCharacter("ad block pls ad wir", 'd'));
    }
}

// Удаление заданного символа