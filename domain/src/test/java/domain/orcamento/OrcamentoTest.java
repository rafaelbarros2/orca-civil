package domain.orcamento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.orcacivil.domain.exceptions.DomainException;
import org.orcacivil.domain.orcamento.Orcamento;
import org.orcacivil.domain.validation.handler.ThrowsValidationHandler;

public class OrcamentoTest {

    private String id;


    @Test
    public void givenAValidParams_whenCallNewOrcamento_thenIntantiateAOrcamento() {
        final var expectedName = "Construção 1";
        final var expectedIsActive = true;
        final var actualOrcamento = Orcamento.newOrcamento(expectedName, expectedIsActive);

        Assertions.assertNotNull(actualOrcamento);
        Assertions.assertNotNull(actualOrcamento.getId());
        Assertions.assertEquals(expectedName, actualOrcamento.getName());
        Assertions.assertEquals(expectedIsActive, actualOrcamento.isActive());
        Assertions.assertNotNull(actualOrcamento.getUpdatedAt());
        Assertions.assertNotNull(actualOrcamento.getCreatedAt());
        Assertions.assertNull(actualOrcamento.getDeletedAt());
    }

    @Test
    public void givenInvalidNullName_whenCallNewOrcamentoAndValidate_whenShouldRecciveError(){
        final String expectedName = null;
        final var expectedIsActive = true;
        final var actualOrcamento = Orcamento.newOrcamento(expectedName, expectedIsActive);
        final var expectedErrorMessager ="O Nome não pode ser nulo" ;

       final var actualException = Assertions.assertThrows(DomainException.class, ()-> actualOrcamento.validate(new ThrowsValidationHandler()));
       Assertions.assertEquals(expectedErrorMessager,actualException.getErrors().get(0).getMessage());

    }
}