package com.erikyuzwa.springboottodo.controllers;

import com.erikyuzwa.springboottodo.models.TodoItem;
import com.erikyuzwa.springboottodo.repositories.TodoItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private TodoItemRepository todoItemRepository;

    @GetMapping("/")
    public String getWelcome(Model model) {

        TodoItem todoItem = new TodoItem();

        todoItem.setCompleted(false);
        todoItem.setDescription("Hello World");
        
        todoItemRepository.save(todoItem);

        Iterable<TodoItem> todoItems = todoItemRepository.findAll();

        model.addAttribute("todoItems", todoItems);
        
        return "welcome";
    }
    
}
