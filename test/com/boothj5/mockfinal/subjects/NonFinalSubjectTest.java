package com.boothj5.mockfinal.subjects;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock ;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class NonFinalSubjectTest {

    @Test
    public void testGetField() {
        final NonFinalSubject subject = new NonFinalSubject("Hello") ;
        assertEquals("Hello", subject.getStringField()) ;
    }
    
    @Test
    public void mockSubject() {
        final NonFinalSubject subject = mock(NonFinalSubject.class) ;
        when(subject.getStringField()).thenReturn("hi") ;
        assertEquals("hi", subject.getStringField()) ;    }
    
}
