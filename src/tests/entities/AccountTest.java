package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        // Arrange
        double amount = 200.00;
        double expectedValue = 196.00;
        Account acc = new Account(0.00);
        // Act
        acc.deposit(amount);
        // Assert
        Assertions.assertEquals(expectedValue, acc.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        double amount = -200.00;
        double expectedValue = 100.00;
        Account acc = new Account(expectedValue);
        acc.deposit(amount);
        Assertions.assertEquals(expectedValue, acc.getBalance());
    }
}
