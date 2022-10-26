package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.humans;

class Employee extends Person {
    String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.printf("Employee %s works in %s \n", super.getNameHuman(), company);
    }
}
