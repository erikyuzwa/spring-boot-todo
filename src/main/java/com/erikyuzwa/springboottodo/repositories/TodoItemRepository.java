package com.erikyuzwa.springboottodo.repositories;

import com.erikyuzwa.springboottodo.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long>  {
    
}
