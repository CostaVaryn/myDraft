package tg.cd23.mar.chainOfResposibility.ver2;

public class PositiveNumberHandler extends Handler{
    public void handleRequest(int request) {
        if (request > 0) {
            System.out.println("PositiveNumberHandler handled the request. Number is positive: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
