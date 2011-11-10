package com.boothj5.mockfinal.subjects;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock ;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class FinalSubjectTest {

    @Test
    public void testGetField() {
        final FinalSubject subject = new FinalSubject("Hello") ;
        assertEquals("Hello", subject.getStringField()) ;
    }
    
    @Test
    public void mockSubject() throws Exception {
        final FinalSubject subject = mock(FinalSubject.class) ;
        when(subject.getStringField()).thenReturn("hi") ;
        assertEquals("hi", subject.getStringField()) ;
    }
}
