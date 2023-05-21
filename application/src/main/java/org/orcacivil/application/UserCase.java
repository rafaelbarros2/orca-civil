package org.orcacivil.application;

import org.orcacivil.domain.orcamento.Orcamento;

public class UserCase {

    public Orcamento execute(){
        return    Orcamento.newOrcamento("Alguem", true);
    }
}