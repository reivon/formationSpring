package fr.reivon.formation.spring.sprintbootHelloWorld.service;

import fr.reivon.formation.spring.sprintbootHelloWorld.domain.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@EnableScheduling
public class TodoService {

    Logger LOG = LoggerFactory.getLogger(TodoService.class);

    static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo("Titre 1", "todo 1"));
        todos.add(new Todo("Titre 2", "todo 2"));
        todos.add(new Todo("Titre 3", "todo 3"));
        todos.add(new Todo("Titre 4", "todo 4"));
    }

    public void addTodo(String title, String description) {
        todos.add(new Todo(title, description));
    }

    public List<Todo> getAllTodo() {
        return todos;
    }

    // tous les 5 secondes
    @Scheduled(cron = "*/5 * * * * *" )
    public void scheduledAdd() {
        LOG.warn("J'ajoute un todo random !");
        todos.add(new Todo("huhu", "hihi"));
    }

}
