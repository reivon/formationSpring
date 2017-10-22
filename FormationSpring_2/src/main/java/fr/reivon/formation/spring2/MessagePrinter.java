package fr.reivon.formation.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.plugin2.message.Message;

import javax.annotation.Resource;

/**
 * Created by tmembot on 16/08/2016.
 */
@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

//    private MessagePrinter() {
//
//    }

//    @Autowired
//    private MessagePrinter(MessageService service) {
//        this.service = service;
//    }

    public void printMessage() {
        System.out.println(service.getMessage());
    }

}