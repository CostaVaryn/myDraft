package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.humans;

public class Program {
    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Leman Brothers");
        sam.display();
        Client bob = new Client("Bob", "Leman Brothers");
        bob.display();

        /*

        ### lesson 1 ###

        Person kate = new Person("Kate", 32, "Baker Street", "+12334567");
        kate.displayName();     // норм, метод public
        kate.displayAge();      // норм, метод имеет модификатор по умолчанию
        kate.displayPhone();    // норм, метод protected
        //kate.displayAddress();  // ! Ошибка, метод private

        System.out.println(kate.name);      // норм, модификатор по умолчанию
        System.out.println(kate.address);   // норм, модификатор public
        System.out.println(kate.age);       // норм, модификатор protected
        //System.out.println(kate.phone);   // ! Ошибка, модификатор private

        Person anna = new Person("Anna", 30, "Limpopo", "+186468991");
        System.out.println(anna.getAgeHuman());      // 30
        anna.setAgeHuman(33);
        System.out.println(anna.getAgeHuman());      // 33
        anna.setAgeHuman(123450);
        System.out.println(anna.getAgeHuman());      // 33

        Person tom = new Person("Tom");
        tom.display();

        Person undef = new Person();
        undef.displayInfo();

         */
    }
}