package stepik.basoop.block1;

public class SimpNumDivide {
    public static void main(String[] args) {
        int number = 42;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
