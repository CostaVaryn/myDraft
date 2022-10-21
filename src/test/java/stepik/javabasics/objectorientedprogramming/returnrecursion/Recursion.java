package stepik.javabasics.objectorientedprogramming.returnrecursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n) {
        System.out.println("Запускается вычисление " + n + " числа Фиббоначи");
        if (n == 1 || n == 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}
