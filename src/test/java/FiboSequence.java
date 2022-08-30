public class FiboSequence {
    public static long[] generateFibonacciSequenceValue(int n) {
        System.out.print("0 ");
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; ++i) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 10;
        long[] fib = generateFibonacciSequenceValue(n);
        for (int i = 0; i < n; i++) {
                System.out.print(Long.toUnsignedString(fib[i]) + " ");
        }
    }
}

