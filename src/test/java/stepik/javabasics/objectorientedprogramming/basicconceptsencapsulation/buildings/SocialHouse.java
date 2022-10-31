package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

public interface SocialHouse {
    default void print() {
        System.out.println("It's a social house.");
    }
}
