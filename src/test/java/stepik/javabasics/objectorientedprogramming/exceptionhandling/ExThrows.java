package stepik.javabasics.objectorientedprogramming.exceptionhandling;

public class ExThrows {
    public static void main (String[] args) {
        try {
            System.out.println(getFactorial(5));
            int result = getFactorial(-6);
            System.out.println(result);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
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
