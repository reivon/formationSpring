package fr.reivon.formation.spring.sprintbootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class TodoApp {

	public static void main(String[] args) {
		SpringApplication.run(TodoApp.class, args);
	}
}
