package com.example.todo;

import java.util.*;

public interface TodoRepository {
    ArrayList<Todo> getTodo();

    Todo addTodo(Todo todo);

    Todo getTodoById(int todoId);

    Todo updateTodoById(int todoId, Todo todo);

    void deleteTodoById(int todoId);
}