package fr.reivon.formation.spring1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //MessagePrinter printer = context.getBean(MessagePrinter.class);
        MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
        printer.printMessage();
    }

}