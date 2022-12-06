package stepik.javapracticeautotest.block6;

public class MainParChild {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.action();
        Parent obj2 = new Child();
        obj2.action();
    }
}


class Parent {
    public void action() {
        System.out.println("Parent action");
    }
}

class Child extends Parent {
    @Override
    // protected void action()
    public void action() {
        System.out.println("Child action");
    }
}

/*
Изучите предлагаемый код.

Исправьте класс Parent или класс Child таким образом, чтобы вывод из консоли был:
Parent action
Child action

Sample Input:

Sample Output:
Parent action
Child action
 */