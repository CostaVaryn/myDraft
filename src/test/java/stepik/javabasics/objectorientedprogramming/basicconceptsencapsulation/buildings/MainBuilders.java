package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

public class MainBuilders {
    public static void main(String[] args) {
        Library lib = new Library("Arcana", "Cooper street", 1703,"Vanja Dontstupid",false,true);
        System.out.println(lib.toString()); // is ignored
        lib.startEvent();
        lib.print();

        Building myHouse = new House("My House", "Ronny squre", 1999,"My construction",false,true);
        myHouse.toString();
        myHouse.startEvent();
        myHouse.print();
        House.LivingHouse.print();

        Building police = new PoliceDepartment("Police Department", "Legal street", 1111,"Sir Patrick Justice", true,false);
        police.startEvent();
        police.print();

        Building mit = new University("Massachusetts Institute of Technology", "77 Massachusetts Avenue", 4-10-1861," Eero Saarine", true,false);
        mit.startEvent();
        mit.print();
    }
}
