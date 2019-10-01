package com.in28Minutes.data.api;

import java.util.Arrays;
import java.util.List;
// Stubs are suitable for simple conditions, its very difficult to handle dynamic conditions,
// which in turn increases the maintainance overhead
public class TodoServiceStub implements TodoService {
    @Override
    public List<String> retrieveTodos(String user) {
        if (user.equals("Dragon Queen")) {
            return Arrays.asList("Master Dagger2","Master Unit Testing","Master Kotlin");
        }
        else
        {
            return Arrays.asList("Master Flutter","Master Swift");
        }
    }
}
