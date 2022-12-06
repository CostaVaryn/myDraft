package stepik.AlgorithmsTheoryAndPractice.introductionTheoryAndTasks;

public class GCD2 {
    private int gcd2(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a >= b) {
            return gcd2(a % b, b);
        } else {
            return gcd2(a, b % a);
        }
    }
    private void run() {
        System.out.println(gcd2(114, 54));
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GCD2().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}