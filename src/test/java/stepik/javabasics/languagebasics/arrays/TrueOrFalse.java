package stepik.javabasics.languagebasics.arrays;

public class TrueOrFalse {
    public static void main(String[] args) {
            System.out.println((!(false && true || !true && false || false)));
            System.out.println((true || false));
            System.out.println((!((true || false) && !(false))));
            System.out.println((true && false));
            System.out.println((true));
            System.out.println((false || true && false));
    }
}
