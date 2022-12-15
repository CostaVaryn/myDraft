package books.leonardtasks.chapter1;

public class PermuteAndPrint {
    public static void permuteAndPrint(String str) {
        permuteAndPrint("", str) ;
    }
    private static void permuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }
    public static void main(String[] args) {
        permuteAndPrint("ABC");
    }
}

// Генерирование всех перестановок