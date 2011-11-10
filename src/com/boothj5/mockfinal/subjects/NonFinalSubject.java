package com.boothj5.mockfinal.subjects;

public class NonFinalSubject {

    private String stringField ;
    
    public NonFinalSubject(String stringField) {
        this.stringField = stringField ;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
    
    
}
