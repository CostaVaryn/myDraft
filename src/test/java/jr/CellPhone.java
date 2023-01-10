package jr;

public class CellPhone extends WirelessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Calling a number " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("A caller is calling you " + inputNumber);
    }
}