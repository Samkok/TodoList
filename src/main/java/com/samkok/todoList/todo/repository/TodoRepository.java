package com.samkok.todoList.todo.repository;

import com.samkok.todoList.todo.model.dao.TodoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoDAO, String> {
}
