package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.humans;

public class Person {
    String name;
    protected int age;
    public String address;
    private String phone;

    {
        name = "Undefined";
        age = 18;
    }
    Person(){
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }
    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }
    protected void displayPhone(){
        System.out.printf("Phone: %s \n", phone);
    }

    public String getNameHuman(){
        return this.name;
    }
    public void setNameHuman(String name){
        this.name = name;
    }
    public int getAgeHuman(){
        return this.age;
    }
    public void setAgeHuman(int age){
        if(age > 0 && age < 110)
            this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}
