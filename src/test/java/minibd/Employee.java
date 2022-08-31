package minibd;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAge){
        age =  empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("Имя:"+ name );
        System.out.println("Возраст:" + age );
        System.out.println("Наименование:" + designation );
        System.out.println("Заработная плата:" + salary);
    }
}