package fr.reivon.formation.spring1;

/**
 * Created by tmembot on 16/08/2016.
 */
public class MessagePrinter {

    private MessageService service;

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }

    public void setService(MessageService service) {
        this.service = service;
    }

}