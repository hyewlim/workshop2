package com.vttp;

public class FixedDepositAccount extends Account {

    private float interest;
    private int duration;

    public FixedDepositAccount(String name) {
        super(name);
    }

    public FixedDepositAccount(String name, float balance) {
        super(name, balance);
    }

    public FixedDepositAccount(String name, float balance, float interest) {
        super(name, balance);
        this.interest = interest;
    }

    public FixedDepositAccount(String name, float balance, float interest, int duration) {
        super(name, balance);
        this.interest = interest;
        this.duration = duration;
    }

    
    
}
