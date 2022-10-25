package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.animals;

class Animal {
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
    public Animal(String type, int age){
        this.type = type;
        this.age = age;
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
        System.out.printf("Тип: %s, Имя: %s, Возраст: %d, Вес: %s, ", type, name.isEmpty() ? "No Name" : name, age, weight);
        System.out.printf("Умеет летать: %s, ", isFly ? "Да" : "Нет");
        System.out.printf("Умеет ходить: %s, ", isWalk ? "Да" : "Нет");
        System.out.printf("Умеет плавать: %s.\n", isSwim ? "Да" : "Нет");
    }

    public void rename(String name){
        this.name = name;
    }
    public void holiday(double a) {
        weight = weight + 0.1 * a;
    }

    /*
    # lesson 1:

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
    public void rename(String str){
        this.name = str;
    }
    public double holiday(double a) {
        return weight = weight + 0.1 * a;
    }
     */
}
