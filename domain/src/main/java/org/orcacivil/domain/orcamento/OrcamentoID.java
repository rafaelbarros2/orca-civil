package org.orcacivil.domain.orcamento;

import org.orcacivil.domain.AggregateRoot;
import org.orcacivil.domain.Identifier;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class OrcamentoID extends Identifier {

    private String value;

    private OrcamentoID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static OrcamentoID unique(){
        return  OrcamentoID.from(UUID.randomUUID());
    }

    public static OrcamentoID from(final String id){
       return new OrcamentoID(id);
    }

    public static OrcamentoID from(final UUID id){
    return new OrcamentoID(id.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrcamentoID that = (OrcamentoID) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}