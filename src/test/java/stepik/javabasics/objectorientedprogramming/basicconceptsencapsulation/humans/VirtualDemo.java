package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.humans;

public class VirtualDemo {
    public static void main(String [] args) {
        Salary s = new Salary("Олег Петров", "Минск, Беларусь", 3, 3600.00);
        Employee e = new Salary("Иван Иванов", "Москва, Россия", 2, 2400.00);
        System.out.println("Вызываем mailCheck, используя ссылку Salary --");
        s.mailCheck();
        System.out.println("Вызываем mailCheck, используя ссылку Employee --");
        e.mailCheck();
    }
}
