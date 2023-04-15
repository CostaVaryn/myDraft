package tg.cd23.mar.chainOfResposibility.ver1;

public class SMSMessageSender extends MessageSender{
    public SMSMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
