package stepik.javabasics.languagebasics.basicstringfunctions;

public class Example {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] c = a;
        c[0] = 5;
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}