package org.orcacivil.domain;

import org.orcacivil.domain.validation.ValidationHandler;

public abstract class AggregateRoot <ID extends Identifier> extends Entity<ID>{
    protected AggregateRoot(final ID id) {
        super(id);
    }

    public abstract void validate(ValidationHandler validationHandler);
}
