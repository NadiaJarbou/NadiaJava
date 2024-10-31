package övningtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {
    @Test
    public void testSendingTest() {


        PasswordCheck pass= new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("password");

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}
