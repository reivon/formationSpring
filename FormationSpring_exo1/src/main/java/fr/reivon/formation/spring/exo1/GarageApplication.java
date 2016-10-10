package fr.reivon.formation.spring.exo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GarageApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Garage garage = context.getBean(Garage.class);
		garage.execute();
	}

}
