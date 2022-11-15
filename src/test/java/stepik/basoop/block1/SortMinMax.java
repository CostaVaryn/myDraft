package stepik.basoop.block1;

import java.util.Arrays;
import java.util.Scanner;

public class SortMinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] array = new double[n];
        double max, min;
        for(int i=0;i<n;i++) {
            array[i] = in.nextDouble();
        }
        in.close();
        Arrays.sort(array);
        /*
        for(int i=0;i<n;i++) {
           ....
        }*/
        min = array[0];
        max = array[n-1];
        System.out.println(min);
        System.out.println(max);
    }
}
