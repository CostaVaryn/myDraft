package codingbat.warmup2;

public class DoubleX {
    static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;

        if (i + 1 >= str.length()) return false;
        return str.charAt(i + 1) == 'x';
    }

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }
}
