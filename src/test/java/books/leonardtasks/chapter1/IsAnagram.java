package books.leonardtasks.chapter1;

public class IsAnagram {
    private static final int EXTENDED_ASCII_CODES = 256;
    public static boolean isAnagram(String strl, String str2) {
        int[] chCounts = new int[EXTENDED_ASCII_CODES];
        char[] chStrl = strl.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        if (chStrl.length != chStr2.length) {
            return false;
        }
        for (int i = 0; i < chStrl.length; i++) {
            chCounts[chStrl[i]]++;
            chCounts[chStr2[i]]--;
        }
        for (int i = 0; i < chCounts.length; i++) {
            if (chCounts[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
