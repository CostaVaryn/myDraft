package tg.cd22.dec;

public class TestNull {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object o) {
        System.out.println("Object method");
    }

    public static void method(String s) {
        System.out.println("String method");
    }
}
