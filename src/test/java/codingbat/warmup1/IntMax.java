package codingbat.warmup1;

public class IntMax {
    public static int intMax(int a, int b, int c) {
        int max = a;
        if (max <= b) {
            max = b;
        }
        if (max <= c) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }
}
