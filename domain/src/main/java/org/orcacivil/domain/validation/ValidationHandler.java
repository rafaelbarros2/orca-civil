package org.orcacivil.domain.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler handler);
    ValidationHandler validate(Validation validation);

    default boolean hasError(){
        return getErrors() != null && !getErrors().isEmpty();
    }

    List<Error> getErrors();
    public interface Validation{
        void validate();
    }
}
