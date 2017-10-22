package fr.reivon.formation.spring.sprintbootHelloWorld.domain;

import javax.validation.constraints.NotNull;

public class Todo {

    @NotNull
    String title;
    @NotNull
    String description;

    public Todo() {

    }

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
