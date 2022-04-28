package com.erikyuzwa.springboottodo.repositories;

import com.erikyuzwa.springboottodo.models.TodoList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList, Long>  {
    
}