package fr.reivon.formation.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PropertyLoader propertyLoader = context.getBean(PropertyLoader.class);

        System.out.println(propertyLoader.getDbUrl());
        System.out.println(propertyLoader.getDbLogin());
    }

}
