package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.orcacivil.application.UserCase;
import org.orcacivil.domain.Orcamento;

public class UserCaseTest {

    @Test
    public void testCreateUserCade(){
        Assertions.assertNotNull(new UserCase());
        Assertions.assertNotNull(new UserCase().execute());
    }
}