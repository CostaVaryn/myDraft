package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation;

public class Cat {
    private String mCatName;

    Cat(String name) {
        mCatName = name;
    }

    public String getName() {
        return mCatName;
    }

    public void setName(String strName) {
        mCatName = strName;
    }
    static void messWithCat(Cat kitty) {
        kitty = new Cat("Han");
    }

    static void changeKitty(Cat kitty) {
        kitty.setName("Wookie");
    }

    static Cat haveKitten() {
        Cat kitten = new Cat("Luke");
        return kitten;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Jabba");
        Cat cat2 = new Cat("Leia");

        cat1.getName();    // Returns Jabba
        cat2.getName();    // Returns Leia
        messWithCat(cat1);
        changeKitty(cat2);
        Cat cat3 = haveKitten();
        System.out.println(cat1.getName());    // Returns Jabba – Note that object remains unchanged!
        System.out.println(cat2.getName());    // Returns Wookie
        System.out.println(cat3.getName());    // Returns Luke
    }
}