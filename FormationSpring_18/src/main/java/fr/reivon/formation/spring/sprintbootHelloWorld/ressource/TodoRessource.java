package fr.reivon.formation.spring.sprintbootHelloWorld.ressource;

import fr.reivon.formation.spring.sprintbootHelloWorld.domain.Todo;
import fr.reivon.formation.spring.sprintbootHelloWorld.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoRessource {

    @Inject
    TodoService todoService;

    @GetMapping("list")
    public ResponseEntity<List<Todo>> getTodos() {
        List<Todo> lst = todoService.getAllTodo();
        return new ResponseEntity<>(lst, HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity addTodo(@Valid @RequestBody Todo dto) {
        todoService.addTodo(dto.getTitle(), dto.getDescription());
        return new ResponseEntity(HttpStatus.CREATED);
    }


}
