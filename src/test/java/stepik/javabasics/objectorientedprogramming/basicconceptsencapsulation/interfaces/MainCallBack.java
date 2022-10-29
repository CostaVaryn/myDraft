package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.interfaces;

public class MainCallBack {
    public static void main(String[] args) {

        SomeClass someClass = new SomeClass();
        MyClass myClass = new MyClass();

        //инициализируем колбек, передавая методу registerCallBack экземпляр MyClass, реализующий интерфейс колбек
        someClass.registerCallBack(myClass);
        someClass.doSomething();

    }
}
