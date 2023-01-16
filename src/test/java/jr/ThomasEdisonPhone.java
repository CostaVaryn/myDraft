package jr;

public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outputNumber) {
        System.out.println("Rotate the handle");
        System.out.println("Give me the phone number, sir");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("The phone rings");
    }
}