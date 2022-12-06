package stepik.ProgrammingWorkshop.tasks2.iotasks1;

import java.util.Scanner;

public class DivApples2 {
    private void run(int n, int k) {
        int res = 0;
        for (int i = 0; i <= k; i++) {
            if (i % n == 0) {
                res = i;
            }
        }
        System.out.println(k - res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        new DivApples2().run(n, k);
    }
}
