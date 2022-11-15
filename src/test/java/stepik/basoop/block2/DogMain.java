package stepik.basoop.block2;

public class DogMain {
    public static void main(String[] args) {
        //Dog dog = new Dog("Mastif", "big", 4);
        //dog.makeVoice();
        try {
            Dog dog1 = new Dog("Mastif", "big", 4);
            dog1.getInfo();
            Dog dog2 = new Dog("Freebreed", "big", -2);
            dog2.getInfo();
        } catch (NegativeAgeException e){
            System.out.println(e.toString());
        }
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

    Dog(String breed, String size, int age) throws NegativeAgeException {
        this.breed = breed;
        this.size = size;
        if(age < 0)
            throw new NegativeAgeException(age);
        this.age = age;
    }

    @Override
    public void makeVoice() {
        System.out.println("Gav Gav Gav");
    }
    void getInfo(){
        System.out.println("breed:" + breed + ", size:" + size+ ", age:" + age);
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
