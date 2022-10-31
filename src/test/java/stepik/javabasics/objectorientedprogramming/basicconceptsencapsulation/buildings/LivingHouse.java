package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

public interface LivingHouse {
    default void print() {
        System.out.println("This is a living house.");
    }
}
