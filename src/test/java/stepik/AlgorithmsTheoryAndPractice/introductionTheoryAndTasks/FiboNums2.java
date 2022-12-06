package stepik.AlgorithmsTheoryAndPractice.introductionTheoryAndTasks;

public class FiboNums2 {
    private static final int MOD = (int) (1e9+7);
    private int fibo(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = (a + b) % MOD;
            // a, b <- b, c
            a = b;
            b = c;
        }
        return a;
    }
    private void run(int n) {
        System.out.println(n + ": " + fibo(n));
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new FiboNums2().run(100000);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
