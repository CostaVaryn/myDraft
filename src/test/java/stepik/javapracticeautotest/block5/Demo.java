package stepik.javapracticeautotest.block5;

public class Demo {
    private int a = 5;
    private static int b = 100;
    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public Demo() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        Demo obj = new Demo();
        System.out.println("a = " + obj.a + " b = " + b);
    }
}
