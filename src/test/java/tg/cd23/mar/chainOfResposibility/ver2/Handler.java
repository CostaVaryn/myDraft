package tg.cd23.mar.chainOfResposibility.ver2;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(int request);
}
