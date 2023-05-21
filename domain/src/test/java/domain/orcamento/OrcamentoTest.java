package domain.orcamento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.orcacivil.domain.orcamento.Orcamento;

public class OrcamentoTest {

    private String id;


    @Test
    public void givenAValidParams_whenCallNewOrcamento_thenIntantiateAOrcamento(){
        final var expectedName = "Construção 1";
        final var expectedIsActive= true;
       final var actualOrcamento =  Orcamento.newOrcamento(expectedName, expectedIsActive);

       Assertions.assertNotNull(actualOrcamento);
       Assertions.assertNotNull(actualOrcamento.getId());
       Assertions.assertEquals(expectedName, actualOrcamento.getName());
       Assertions.assertEquals(expectedIsActive, actualOrcamento.isActive());
        Assertions.assertNotNull(actualOrcamento.getUpdatedAt());
        Assertions.assertNotNull(actualOrcamento.getCreatedAt());
        Assertions.assertNull(actualOrcamento.getDeletedAt());
    }
}