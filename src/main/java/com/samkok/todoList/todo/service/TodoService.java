package com.samkok.todoList.todo.service;

import com.samkok.todoList.todo.model.dao.TodoDAO;
import com.samkok.todoList.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements TodoServiceIF {

    @Autowired
    private TodoRepository todoRepository;


    @Override
    public TodoDAO getTodoById(String todoId) {
        return null;
    }
}
