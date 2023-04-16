package tg.cd23.mar.chainOfResposibility.ver2;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Handler negativeNumberHandler = new NegativeNumberHandler();
        Handler zeroNumberHandler = new ZeroNumberHandler();
        Handler positiveNumberHandler = new PositiveNumberHandler();

        negativeNumberHandler.setNext(zeroNumberHandler);
        zeroNumberHandler.setNext(positiveNumberHandler);

        int[] requests = {-2, 5, 14, 22, -18, 3, 0, -20};

        Arrays.stream(requests).forEach(negativeNumberHandler::handleRequest);
    }
}
// https://habr.com/ru/articles/727454/
