package com.boothj5.mockfinal.subjects;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock ;
import static org.mockito.Mockito.when ;
import static org.mockito.Mockito.verify ;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.Modifier;

import org.junit.Before;
import org.junit.Test;

public class FinalSubjectTest {

    @Test
    public void testGetField() {
        final FinalSubject subject = new FinalSubject("Hello") ;
        assertEquals("Hello", subject.getStringField()) ;
    }
    
    @Test
    public void mockSubject() throws Exception {
        final FudgedFinalSubject subject = mock(FudgedFinalSubject.class) ;
        subject.setStringField("hi") ;
        assertTrue(true) ;
    }
}
