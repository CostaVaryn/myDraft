package stepik.AlgorithmsTheoryAndPractice.introductionTheoryAndTasks;

public class hw {
    private void run() {
        int j = 0;
        for (int i = 0; i < 1000000000; i++) {
            j += i;
        }
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new hw().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
