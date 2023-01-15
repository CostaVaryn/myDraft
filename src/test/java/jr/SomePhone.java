package jr;

public class SomePhone {

    private int year;
    private String company;
    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }
    private void openConnection(){
        //findComutator
        //openNewConnection...
    }
    public void call() {
        openConnection();
        System.out.println("Call number");
    }

    public void ring() {
        System.out.println("Ring ring");
    }
}
