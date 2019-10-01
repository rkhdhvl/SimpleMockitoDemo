package com.in28Minutes.bussiness;

import com.in28Minutes.data.api.TodoService;
import com.in28Minutes.data.api.TodoServiceStub;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TodoBussinessImplStubTest  {
    @Test
    public void testTodoServiceRelatedToSpring_usingStub()
    {
        // previously created a TodoService object with help of a stub class which implemented the interface
        TodoServiceStub todoService = new TodoServiceStub();
        // Instead of using stubs , mocking TodoService Objects and using them
        TodoService todoServiceUsingMock = mock(TodoService.class);
        List<String> user1TodoList = Arrays.asList("Master Dagger2","Master Unit Testing","Master Kotlin");
        // writing the logic present inside a stub using when in mockito
        when(todoServiceUsingMock.retrieveTodos("Dragon Queen")).thenReturn(user1TodoList);
        TodoBussinessImpl todoBussiness = new TodoBussinessImpl(todoServiceUsingMock);
        List<String> filteredTodos = todoBussiness.retrieveTodosRelatedToSpring("Dragon Queen");
        assertEquals(3,filteredTodos.size());
    }

    @Test
    public void testTodoServiceRelatedToSpring_usingStub2()
    {
        TodoServiceStub todoService = new TodoServiceStub();
        TodoBussinessImpl todoBussiness = new TodoBussinessImpl(todoService);
        List<String> filteredTodos = todoBussiness.retrieveTodosRelatedToSpring("Demo User");
        assertEquals(2,filteredTodos.size());
    }

}
