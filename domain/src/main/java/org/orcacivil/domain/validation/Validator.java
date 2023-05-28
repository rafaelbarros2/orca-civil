package org.orcacivil.domain.validation;

public abstract class Validator {

    private ValidationHandler validationHandler;

    public Validator(ValidationHandler validationHandler) {
        this.validationHandler = validationHandler;
    }

    public abstract void validate();
    protected ValidationHandler validationHandler(){
       return this.validationHandler;
    }
}
