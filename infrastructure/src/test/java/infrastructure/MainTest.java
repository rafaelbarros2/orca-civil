package infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.orcacivil.application.UserCase;
import org.orcacivil.infrastructure.Main;

public class MainTest {

    @Test
    public void testMain(){
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }


}