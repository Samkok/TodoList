package com.samkok.todoList.todo.service;

import com.samkok.todoList.todo.model.dao.TodoDAO;

public interface TodoServiceIF {

    TodoDAO getTodoById(String todoId);

}
