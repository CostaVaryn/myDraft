package stepik.javabasics.objectorientedprogramming.exceptionhandling;

public class ExThrows {
    public static void main (String[] args) throws Exception {
        System.out.println(getFactorial(2));
        System.out.println(getFactorial(-1));
    }
    public static int getFactorial(int num) throws Exception {

        if (num < 1) throw new Exception ("Число меньше 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
