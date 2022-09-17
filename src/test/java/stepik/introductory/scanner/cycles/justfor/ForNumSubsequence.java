package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForNumSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i==(n-1)) break; {
                    for (int j = 1; j<=i; j++) {
                        if (i==n) break; {
                            System.out.print(i + (i==n ? "" : " "));
                        }
                    }
                }
            }
        }
    }
}
