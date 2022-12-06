package stepik.javapracticeautotest.block5;

public class MainTriangle {
    public static void main (String[] args) {
    //Напишите свой код здесь
    }
}

class Triangle {
    PointTriangle a, b, c;

    public Triangle(PointTriangle a, PointTriangle b, PointTriangle c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return 0;
    }
}

class PointTriangle {
    private double x;
    private double y;

    public PointTriangle(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}