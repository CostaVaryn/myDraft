package books.leonardtasks.chapter1;

public class ConcatRepeat {
    public static String concatRepeat(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n);
        for (int i = 1; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}

/*
Конкатенирование одной и той же строки п раз
 */