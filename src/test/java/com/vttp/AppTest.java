package com.vttp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    BankAccount account;

    @Before
    public void setup() {
        account = new BankAccount("Hong Yew", 1000);

    }

    @Test
    public void successfulWithdraw() {
        this.account.withdraw(100);
        assertEquals(900, account.getBalance(), 0);
    }
}
