package com.in28Minutes.bussiness;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void testList(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2,listMock.size());
    }

    @Test
    public void testListWithMultipleValues(){
        List mockingAList = mock(List.class);
        when(mockingAList.size()).thenReturn(2).thenReturn(3);
        assertEquals(2,mockingAList.size());
        assertEquals(3,mockingAList.size());
    }

    @Test
    public void testingGetMethodOfListClass()
    {
        List mockedListObj = mock(List.class);
       // when(mockedListObj.get(0)).thenReturn("Kotlin");
        // using a argument matcher to match any int value
         when(mockedListObj.get(anyInt())).thenReturn("Kotlin");
        assertEquals("Kotlin",mockedListObj.get(0));
        // calling a non stubbed method
       // assertNull(null, String.valueOf(mockedListObj.get(1)));
        assertEquals("Kotlin",mockedListObj.get(100));
    }

    @Test
    public void testAnExceptionThrownForAMethod()
    {
      List mockedListObj = mock(List.class);
      when(mockedListObj.get(anyInt())).thenThrow(new RuntimeException("Some Exception"));
      Executable executable = () -> mockedListObj.get(0);
      assertThrows(RuntimeException.class,executable);
    }


}
