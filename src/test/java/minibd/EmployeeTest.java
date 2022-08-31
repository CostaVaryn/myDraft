package minibd;

public class EmployeeTest{

    public static void main(String args[]){
        Employee empOne = new Employee("Олег Олегов");
        Employee empTwo = new Employee("Иван Иванов");

        empOne.empAge(26);
        empOne.empDesignation("Старший инженер-программист");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Инженер-программист");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}