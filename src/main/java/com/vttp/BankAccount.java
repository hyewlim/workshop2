package com.vttp;

public class BankAccount extends Account {

    

    public BankAccount(String name) {
        super(name);
    }

    public BankAccount(String name, float balance) {
        super(name, balance);
    }

    public BankAccount(BankAccount source) {
        super(source);
        
    }
    
}
