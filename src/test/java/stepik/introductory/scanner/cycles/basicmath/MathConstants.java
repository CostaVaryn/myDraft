package stepik.introductory.scanner.cycles.basicmath;

public class MathConstants {
    public static void main(String[] args) {
        double x = Math.E;
        double y = Math.PI;
        double a = Math.pow(x, y);
        double b = Math.pow(y, x);
        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("=");
        } else if (a < b) {
            System.out.println("<");
        }
    }
}
