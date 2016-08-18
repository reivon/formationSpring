package fr.reivon.formation.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by tmembot on 16/08/2016.
 */
@Component
public class MessageServiceImpl implements MessageService {

    String message = "Hello World !";

    public String getMessage() {
        return message ;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
