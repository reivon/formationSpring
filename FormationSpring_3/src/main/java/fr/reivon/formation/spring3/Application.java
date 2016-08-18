package fr.reivon.formation.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        VehiculeCollection jc = context.getBean(VehiculeCollection.class);

        jc.getVehiculeList();
        jc.getVehiculeSet();
        jc.getVehiculeMap();
        jc.getVehiculeProp();
    }

}
