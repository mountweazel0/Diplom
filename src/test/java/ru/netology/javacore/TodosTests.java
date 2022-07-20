package ru.netology.javacore;

import org.junit.jupiter.api.*;

public class TodosTests {
    Todos sut;

    @BeforeAll
    public static void startTests() {
        System.out.println("Start testing Todos.class: ");
    }

    @AfterAll
    public static void finishTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void startTest() {
        sut = new Todos();
        System.out.println("Testing begins ...");
    }

    @AfterEach
    public void finishTest() {
        System.out.println("Test is completed");
    }

    @Test
    public void testAddTask() {
        Todos expected = new Todos();
        expected.todos.add("Acrobatics");

        sut.addTask("Acrobatics");

        Assertions.assertEquals(expected.todos, sut.todos);
    }

    @Test
    public void testRemoveTask() {
        Todos expected = new Todos();
        expected.todos.add("Jogging");

        sut.addTask("Jogging");
        sut.addTask("Sport");
        sut.removeTask("Sport");

        Assertions.assertEquals(expected.todos, sut.todos);
    }

    @Test
    public void getAllTasksTest() {
        String task1 = "Acrobatics";
        String task2 = "Jogging";
        String task3 = "Sport";
        String expected = "Acrobatics Jogging Sport";

        sut.addTask(task1);
        sut.addTask(task2);
        sut.addTask(task3);
        String result = sut.getAllTasks();

        Assertions.assertEquals(expected, result);
    }

}