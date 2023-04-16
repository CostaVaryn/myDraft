package tg.cd23.mar.chainOfResposibility.ver2;

public class ZeroNumberHandler extends Handler{
    public void handleRequest(int request) {
        if (request == 0) {
            System.out.println("ZeroNumberHandler handled the request. Number is zero: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
