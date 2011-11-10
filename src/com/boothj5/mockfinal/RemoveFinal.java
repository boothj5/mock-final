package com.boothj5.mockfinal;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.Modifier;

import com.boothj5.mockfinal.subjects.FinalSubject;

public class RemoveFinal {

    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("MOCK-FINAL --> Starting") ;
        System.out.println() ;
        
        final String className = FinalSubject.class.getCanonicalName() ;
        System.out.println("** Removing final from class: " + className);
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get(className);

        int modifiers = cc.getModifiers();
        if (Modifier.isFinal(modifiers)) {
            int notFinalModifier = Modifier.clear(modifiers, Modifier.FINAL);
            cc.setModifiers(notFinalModifier);
        }
        
        cc.writeFile("/home/james/projects-git/mock-final/bin/");
        System.out.println("** Fudged " + cc.getName());
        System.out.println();
        System.out.println("MOCK-FINAL --> Done") ;
        System.out.println() ;

    }

}
