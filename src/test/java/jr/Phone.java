package jr;

public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Calling a number " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("The phone rings");
    }
}