package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.animals;

public class Animal {

    static int COUNTER = 1;
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    {
        name = name;
        type = type;
    }
    public Animal() {
        COUNTER++;
    }
    public String toString() {
        return "Тип: " + type + ", Имя: " +  name + ", Возраст: " + age + ", Вес: " + weight;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public static void isAnimal() {
        System.out.println("Of course");
    }
    public final static String Description(){
        return "I am an animal. I am not afraid";
    }
    public void display() {
        System.out.printf("Тип: %s, Имя: %s, Возраст: %d, Вес: %s, ", type, name, age, weight);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
    public final void rename(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    /*

        ### lesson 5 ###

    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    public Animal() {
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public void display() {
        System.out.printf("Тип: %s, Имя: %s, Возраст: %d, Вес: %s, ", type, name, age, weight);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
    public void setName(String str) {
        name = str;
    }

        ### lesson 4 ###

    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public void display() {
        System.out.printf("Тип: %s, Имя: %s, Возраст: %d, Вес: %s, ", type, name, age, weight);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
    public void holiday() {
        weight = Math.ceil((weight+0.1)*100)/100;
    }
    public void holiday(double a) {
        weight = Math.ceil((weight+a)*100)/100;
    }
    public void holiday(double m, int n) {
        weight = Math.ceil((weight+(n*m))*100)/100;
    }

        ### lesson 3 ###

    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setSwimm(boolean isSwim) {
    }
    public void setWalk(boolean isWalk) {
    }
    public void setFly(boolean isFly) {
    }
    public void display() {
        System.out.printf("Тип: %s, Имя: %s, Возраст: %d, Вес: %s, ", type, name, age, weight);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
    public void rename(String name) {
        this.name = name;
    }
    public void holiday(double a) {
        weight = weight + 0.1 * a;
    }
    public int getAge(){
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public double getWeight() {
        return this.weight;
    }
    public String getType() {
        return this.type;
    }
    public String isSwimm () {
        return isSwim ? "Да" : "Нет";
    }
    public String isWalk () {
        return isWalk ? "Да" : "Нет";
    }
    public String isFly () {
        return isFly ? "Да" : "Нет";
    }

        ### lesson 2 ###

    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        name = "No Name";
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public void display() {
        System.out.printf("Тип: %s, Имя: %s, Возраст: %d, Вес: %s, ", type, name, age, weight);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
    public void rename(String name) {
        this.name = name;
    }
    public void holiday(double a) {
        weight = weight + 0.1 * a;
    }

        ### lesson 1 ###

    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    public void display() {
        System.out.printf("Тип: %s, Имя: %s, Возраст: %d, Вес: %s, ", type, name, age, weight);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
    public void rename(String str) {
        this.name = str;
    }
    public double holiday(double a) {
        return weight = weight + 0.1 * a;
    }
     */
}

class Bird extends Animal {
    String area;
    boolean winterFly;
    {
        name = "Ara";
        type = "Bird";
    }
    public Bird() {
    }
    public void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }
    public void setArea(String str) {
        area = str;
    }
    public void setWinterFly(boolean b) {
    }
    public String getArea() {
        return area;
    }
    public boolean isWinterFly() {
        return winterFly;
    }
    @Override
    public void display() {
        System.out.println("I am Bird");
        System.out.printf("Тип: %s, Возраст: %d, Вес: %s, ", type, age, weight);
        System.out.printf("Среда обитания: %s, ", area);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Улетает зимовать: %s, ", winterFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
}

final class Fish extends Animal {
    String squama;
    boolean upStreamSwim;

    {
        name = "Fugu";
        type = "Fish";
    }
    public Fish() {
    }
    public void bul_bul() {
        System.out.println("Bul-bul");
    }
    public void setSquama(String squama) {
        this.squama = squama;
    }
    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
    public String getSquama() {
        return squama;
    }
    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }
    @Override
    public void display() {
        System.out.println("I am Fish");
        System.out.printf("Тип: %s, Возраст: %d, Вес: %s, ", type, age, weight);
        System.out.printf("Тип чешуи: %s, ", squama);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
        System.out.printf("Умеет плавать против течения: %s, ", upStreamSwim ? "Да" : "Нет");
    }
}

class Insect extends Animal {
    int wingCount;
    boolean likeJesus;

    {
        name = "Bugger";
        type = "Insect";
    }
    public Insect() {
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }
    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }
    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }
    public int getWingCount() {
        return wingCount;
    }
    public boolean isLikeJesus() {
        return likeJesus;
    }
    @Override
    public void display() {
        System.out.println("I am Insect");
        System.out.printf("Тип: %s, Возраст: %d, Вес: %s, ", type, age, weight);
        System.out.printf("Количество крыльев: %s, ", wingCount);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет ходить по воде: %s, ", likeJesus ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }
}