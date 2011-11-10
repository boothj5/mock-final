package com.boothj5.mockfinal;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.Modifier;

import com.boothj5.mockfinal.subjects.FinalSubject;

public class RemoveFinal {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        final String className = FinalSubject.class.getCanonicalName() ;
        System.out.println("Processing class: " + className);
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get(className);

        int modifiers = cc.getModifiers();
        if (Modifier.isFinal(modifiers)) {
            int notFinalModifier = Modifier.clear(modifiers, Modifier.FINAL);
            cc.setModifiers(notFinalModifier);
        }
        
        if (Modifier.isFinal(cc.getModifiers())) {
            throw new IllegalStateException("Class '" + className + "' is not final?!?");
        }
        
        cc.setName("com.boothj5.mockfinal.subjects.FudgedFinalSubject") ;
        cc.writeFile("/home/james/projects-git/mock-final/bin/");
        System.out.println("Fudged " + cc.getName());
        System.out.println();

    }

}
