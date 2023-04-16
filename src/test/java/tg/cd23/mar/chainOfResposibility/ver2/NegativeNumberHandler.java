package tg.cd23.mar.chainOfResposibility.ver2;

public class NegativeNumberHandler extends Handler{
    public void handleRequest(int request) {
        if (request < 0) {
            System.out.println("NegativeNumberHandler handled the request. Number is negative: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}