package stepik.introductory;

public class LogicExpression {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int c = 30;
        int q = 5;

        boolean r = (a || b && c >= 25) || (c < 20 * q) && !(q == 5);
        System.out.println(r);
    }
}
