package com.taskService.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskService.models.TodoList;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Long>{
    List<TodoList> findByCreatedBy(String createdBy); // String param
}