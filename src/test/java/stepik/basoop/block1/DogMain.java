package stepik.basoop.block1;

public class DogMain {


    public static void main(String[] args) {
        Dog dog = new Dog("Mastif", "big", 7 );
        dog.getInfo();
        int calories = dog.eat(40,50,30);
        System.out.println(calories);
    }

}
class Dog{

    String breed;
    String size;
    int age;

    Dog(String breed, String size, int age){
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    void getInfo(){
        System.out.println("breed:" + breed +", size:" + size + ", age:" + age);
    }
    int eat(int carbohydrates, int squirrels, int fats) {
        return carbohydrates * 4 + squirrels * 4 + fats * 9;
    }
}