package stepik.basoop.block2;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Mastif", "big", 4);
        dog.makeVoice();
        Cat cat = new Cat("Freebreed", "small", 3);
        cat.makeVoice();
    }
}
interface Voiceable {
    void makeVoice();
}
class Dog implements Voiceable {

    private String breed;
    private String size;
    private int age;

    Dog(String breed, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    @Override
    public void makeVoice() {
        System.out.println("Gav Gav Gav");
    }
}

class Cat implements Voiceable {

    private String breed;
    private String size;
    private int age;

    Cat(String breed, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    @Override
    public void makeVoice() {
        System.out.println("Meow Meow Meow");
    }
}