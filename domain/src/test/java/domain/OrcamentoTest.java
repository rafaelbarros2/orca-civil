package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.orcacivil.domain.Orcamento;

public class OrcamentoTest {

private String id;

@Test
    public void TestNewOrcamento(){
    Assertions.assertNotNull(new Orcamento());
}
}