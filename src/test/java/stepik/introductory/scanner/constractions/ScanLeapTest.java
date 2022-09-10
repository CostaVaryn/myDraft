package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class ScanLeapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        boolean z;
        if (( y < 1 ) || (m > 12 || m < 1) || (d > 31 || d < 1)) {
            z = false;
        } else {
            if (((y%4==0)||(y%100!=0)&&(y%400==0))&&(m==2)&&(d>29)) {
                z=false;
            }else{
                if (((y%4!=0)||(y%100==0)&&(y%400!=0))&&(m==2)&&(d>28)) {
                    z=false;
                }else{
                    if ((m==4||m==6||m==9||m==11)&&(d>30)) {
                        z=false;
                    }else{
                        z=true;
                    }
                }
            }
        }
        System.out.println(z);
    }
}

/**
 *Sample Input 1:
 * 25 8 2010
 * Sample Output 1:
 * true
 *
 * Sample Input 2:
 * 1 1 1
 * Sample Output 2:
 * true
 */