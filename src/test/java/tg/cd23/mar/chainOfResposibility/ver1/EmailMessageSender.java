package tg.cd23.mar.chainOfResposibility.ver1;

public class EmailMessageSender extends MessageSender{

    public EmailMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
