package com.in28Minutes.data.api;

import java.util.List;
//Phase 2
// create TodoServiceStub
// test TodoBusinessImpl using the TodoServiceStub
public interface TodoService {
    public List<String> retrieveTodos(String user);
}
