
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class BankAccountTest {


    @Test
    void getAmount() {
        BankAccount account = new BankAccount(100);
        Assertions.assertEquals(100, account.getAmount());
    }

    @Test
    void setAmount() {
        BankAccount account = new BankAccount(100);
        account.setAmount(200);
        Assertions.assertEquals(200, account.getAmount());
    }

    @Test
    void add() {
        BankAccount account = new BankAccount(100);
        account.add(50);
        Assertions.assertEquals(150, account.getAmount());
    }

    @Test
    void draw() {
        BankAccount account = new BankAccount(100);
        account.draw(50);
        Assertions.assertEquals(50, account.getAmount());
    }
}