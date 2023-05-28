package org.orcacivil.domain.validation.handler;

import org.orcacivil.domain.exceptions.DomainException;
import org.orcacivil.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(Error anError) {
        throw  DomainException.with(List.of(anError));
    }

    @Override
    public ValidationHandler append(ValidationHandler handler) {
        throw  DomainException.with(handler.getErrors());
    }

    @Override
    public ValidationHandler validate(Validation validation) {
        try{
            validation.validate();
        }catch (Exception e){
            throw  DomainException.with(List.of(new Error(e.getMessage())));
        }
        return this;
    }

    @Override
    public List<Error> getErrors() {
        return null;
    }
}
