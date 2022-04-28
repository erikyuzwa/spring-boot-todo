package com.erikyuzwa.springboottodo.controllers;

import com.erikyuzwa.springboottodo.models.TodoItem;
import com.erikyuzwa.springboottodo.models.TodoList;
import com.erikyuzwa.springboottodo.repositories.TodoItemRepository;
import com.erikyuzwa.springboottodo.repositories.TodoListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @Autowired
    private TodoItemRepository todoItemRepository;

    @Autowired
    private TodoListRepository todoListRepository;

    @GetMapping("/")
    public ModelAndView getWelcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");

        TodoList todoList = new TodoList();
        TodoItem todoItem = new TodoItem();

        todoItem.setTodoList(todoList);
        todoItem.setCompleted(false);
        todoItem.setDescription("Hello World");
        
        todoListRepository.save(todoList);
        todoItemRepository.save(todoItem);

        return modelAndView;
    }
    
}
