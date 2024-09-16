package assignmentTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import assignmentClasses.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account();
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0.0, account.getBalance(), "Initial balance should be 0.0");
    }

    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), "Balance should be 100.0 after deposit");
    }

    @Test
    public void testWithdraw() {
        account.deposit(200.0); // Adding money before testing withdrawal
        double withdrawnAmount = account.withdraw(50.0);
        assertEquals(50.0, withdrawnAmount, "Withdrawn amount should be 50.0");
        assertEquals(150.0, account.getBalance(), "Balance should be 150.0 after withdrawal");
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        account.deposit(30.0);
        double withdrawnAmount = account.withdraw(50.0);
        assertEquals(0.0, withdrawnAmount, "Withdrawn amount should be 0.0 due to insufficient balance");
        assertEquals(30.0, account.getBalance(), "Balance should remain 30.0 after failed withdrawal");
    }

    @Test
    public void testMultipleTransactions() {
        account.deposit(50.0);
        account.deposit(25.0);
        account.withdraw(30.0);
        assertEquals(45.0, account.getBalance(), "Balance should be 45.0 after multiple transactions");
    }
}
