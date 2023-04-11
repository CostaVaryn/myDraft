package writer;

abstract class Shape {
    int width;

    abstract void area();
}

class Square extends Shape {
    Square(int x) {
        width = x;
    }

    @Override
    void area() {
        System.out.println(width * width);
    }
}

public class ProgShape {
    public static void main(String[] args) {
        int x = 5;
        Square a = new Square(x);
        a.area();
    }
}
