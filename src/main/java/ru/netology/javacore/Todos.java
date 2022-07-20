package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    protected List<String> todos;

    public Todos() {
        todos = new ArrayList<>();
    }

    public void addTask(String task) {
        if (todos.contains(task)) {
            System.out.println(task + " already contains in the ToDo List");
        } else {
            todos.add(task);
            System.out.println("You've added task: " + task + " in the ToDo List");
        }
    }

    public void removeTask(String task) {
        if (todos.contains(task)) {
            todos.remove(task);
            System.out.println("The task: " + task + " - was deleted");
        } else {
            System.out.println(task + " is not in the ToDo List");
        }
    }

    public String getAllTasks() {
        return todos.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(" "));
    }
}