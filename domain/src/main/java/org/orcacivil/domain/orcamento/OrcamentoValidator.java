package org.orcacivil.domain.orcamento;

import org.orcacivil.domain.validation.ValidationHandler;
import org.orcacivil.domain.validation.Validator;

public class OrcamentoValidator extends Validator {

    private final Orcamento orcamento;
public  OrcamentoValidator (ValidationHandler handler, Orcamento orcamento){
    super(handler);
    this.orcamento = orcamento;
}
    @Override
    public void validate() {
        if(this.orcamento.getName() == null){
            this.validationHandler().append(new Error("O Nome não pode ser nulo"));
        }
    }
}
