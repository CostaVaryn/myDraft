package stepik.basoop.block1;

public class DogMain {


    public static void main(String[] args) {
        Dog dog1 = new Dog("Mastif", "big", 4, 16.5f );

        Dog dog2 = new Dog("lapdog", "small", 3, 2.5f );
        dog1.getInfo();

        int calories;
        String result;
        calories = dog1.eat(40,50,30);
        result = dog1.checkCalories(calories);

        System.out.println(result);

        calories = dog2.eat(6,6,8);
        result = dog2.checkCalories(calories);

        System.out.println(result);
    }

}
class Dog{

    String breed;
    String size;
    int age;
    float weight;

    Dog(String breed, String size, int age,float weight){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.weight = 5.0F;
    }

    void getInfo(){
        System.out.println("breed:" + breed +", size:" + size + ", age:" + age);
    }
    int eat(int carbohydrates, int squirrels, int fats) {
        return carbohydrates * 4 + squirrels * 4 + fats * 9;
    }
    String checkCalories(int calories){
        float weiCal = (calories/10)*weight;
        float rez = weiCal - calories;
        if ((rez >= -30) && (rez <= 30)) {
            return "good";
        } else if (rez < 30) {
            return "bad";
        } else if (rez < -30) {
            return "overate";
        }
        return null;
    }
}