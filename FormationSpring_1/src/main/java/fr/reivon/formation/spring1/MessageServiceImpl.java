package fr.reivon.formation.spring1;

/**
 * Created by tmembot on 16/08/2016.
 */
public class MessageServiceImpl implements MessageService {
    String message = "default message";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
