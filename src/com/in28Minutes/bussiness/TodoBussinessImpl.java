package com.in28Minutes.bussiness;

import com.in28Minutes.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;
// This class is the system under test (SUT)
public class TodoBussinessImpl {
    // TodoService is the dependency
    private TodoService todoService;
    public TodoBussinessImpl(TodoService todoService)
    {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToMasterSkills(String user)
    {
      List<String> filteredTodos = new ArrayList<String>();
      List<String> todos = todoService.retrieveTodos(user);
              for(String todo : todos) {
                      if (todo.contains("Master")) {
                          filteredTodos.add(todo);
                      }
              }
              return filteredTodos;
    }
}
