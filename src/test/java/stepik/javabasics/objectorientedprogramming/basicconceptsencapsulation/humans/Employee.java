package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.humans;

public class Employee extends Person{

    private String bank;

    public Employee(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }

    /*

        ### lesson 1 ###

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Собираем данные о работнике");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Отправляем чек " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }


        last use, no redacted

    String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.printf("Employee %s works in %s \n", super.getNameHuman(), company);
    }
    */
}
