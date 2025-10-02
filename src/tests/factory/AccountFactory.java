package tests.factory;

import entities.Account;

public class AccountFactory {
    public static Account createEmptyAccount() {
        return new Account(0.00);
    }

    public static Account createAccount(double initialBalance) {
        return new Account(initialBalance);
    }
}
