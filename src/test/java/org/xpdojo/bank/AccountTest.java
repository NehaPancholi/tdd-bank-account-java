package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertEquals(account.balance,0);
    }

    @Test
    public void depositAnAmount() {
        Account account = new Account();
        account.deposit(100);
        assertEquals(account.balance, 100);
    }

    @Test
    public void depositMultipleAmount() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(200);
        assertEquals(account.balance, 300);
    }

    @Test
    public void withdrawanAmount() {
        Account account = new Account();
        account.withdraw(50);
        assertEquals(account.balance, -50);
    }

}
