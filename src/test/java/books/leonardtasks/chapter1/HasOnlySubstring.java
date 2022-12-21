package books.leonardtasks.chapter1;

public class HasOnlySubstring {
    public static boolean hasOnlySubstrings(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() / 2; i++) {
            sb.append(str.charAt(i));
            String resultStr = str.replaceAll(sb.toString(), "");
            if (resultStr.length() == 0) {
                return true;
            }
        }
        return false;
    }
}

/*
Проверка, является ли строка последовательностью одной и той же подстроки.
 */