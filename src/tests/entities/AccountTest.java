package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.AccountFactory;

public class AccountTest {
    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        // Arrange
        double amount = 200.00;
        double expectedValue = 196.00;
        Account acc = AccountFactory.createEmptyAccount();
        // Act
        acc.deposit(amount);
        // Assert
        Assertions.assertEquals(expectedValue, acc.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        double amount = -200.00;
        double expectedValue = 100.00;
        Account acc = AccountFactory.createAccount(expectedValue);
        acc.deposit(amount);
        Assertions.assertEquals(expectedValue, acc.getBalance());
    }

    @Test
    public void fullWithdrawShouldClearBalance() {
        double amount = 800.00;
        double expectedValue = 0.00;
        Account acc = AccountFactory.createAccount(amount);
        acc.fullWithdraw();
        Assertions.assertEquals(expectedValue, acc.getBalance());
    }
}
