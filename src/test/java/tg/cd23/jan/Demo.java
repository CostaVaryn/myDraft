package tg.cd23.jan;

public class Demo {
    public void show(int n) {
        System.out.println("In int " + n);
    }
    public void show(String s) {
        System.out.println("In String " + s);
    }
    public void show(byte b) {
        System.out.println("In byte " + b);
    }
}

class UseDemo {
    public static void main(String[] args) {
        byte a = 21;
        Demo obj = new Demo();
        obj.show(a);
        obj.show("Arno");
        obj.show(100_500);
        obj.show('A'); // int 65
        obj.show("A");
        obj.show(' '); // int 32
    }
}
