package com.example.todo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.todo.TodoService;
import com.example.todo.Todo;

@RestController
public class TodoController {
    TodoService todoService = new TodoService();

    @GetMapping("/todos")
    public ArrayList<Todo> getTodo() {
        return todoService.getTodo();
    }

    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @GetMapping("/todos/{todoId}")
    public Todo getTodoById(@PathVariable("todoId") int todoId) {
        return todoService.getTodoById(todoId);
    }

    @PutMapping("/todos/{todoId}")
    public Todo updateTodoById(@PathVariable("todoId") int todoId, @RequestBody Todo todo) {
        return todoService.updateTodoById(todoId, todo);
    }

    @DeleteMapping("/todos/{todoId}")
    public void deleteTodoById(@PathVariable("todoId") int todoId) {
        todoService.deleteTodoById(todoId);
    }
}