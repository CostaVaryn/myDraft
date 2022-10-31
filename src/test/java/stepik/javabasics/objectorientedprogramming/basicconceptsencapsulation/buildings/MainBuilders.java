package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

public class MainBuilders {
    public static void main(String[] args) {
        Library lib = new Library("Arcana", "Cooper street", 1703,"Vanja Dontstupid",false,true);
        lib.toString(); // is ignored
        lib.startEvent();
        lib.print();

        Building house = new House("My House", "Ronny squre", 1999,"My construction",false,true);
        house.toString();
        house.startEvent();
        house.print();
    }
}
