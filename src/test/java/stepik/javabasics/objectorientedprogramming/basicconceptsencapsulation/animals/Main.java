package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.animals;

public class Main {
    public static void main(String[] args) {

        Animal tiger = new Animal("тигр", "Артём");
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();

        Animal sparrow = new Animal("воробей", 5);
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
        /*
        # lesson 1

        Animal tiger = new Animal();
        tiger.type = "тигр";
        tiger.name = "Артём";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();
        tiger.rename("Антон");
        tiger.display();

        Animal sparrow = new Animal();
        sparrow.type = "воробей";
        sparrow.name = "Капитан Джек";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();
        sparrow.holiday(2);
        sparrow.display();

        */
    }
}

