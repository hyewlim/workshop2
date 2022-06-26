package com.vttp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Account {
    private final String name;
    private final String accountNumber = UUID.randomUUID().toString().substring(0, 8);
    private float balance;
    private List<String> transactions = new LinkedList<>();
    private boolean isClosed;
    private String acctOpenDate;
    private String acctCloseDate;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
    }

    public Account(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(Account source) {
        this.name = source.name;
        this.balance = source.balance;
        
    }


    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    };
    
    public boolean isClosed() {
        return isClosed;
    }
    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }
    public String getAcctOpenDate() {
        return acctOpenDate;
    }
    public void setAcctOpenDate(String acctOpenDate) {
        this.acctOpenDate = acctOpenDate;
    }
    public String getAcctCloseDate() {
        return acctCloseDate;
    }
    public void setAcctCloseDate(String acctCloseDate) {
        this.acctCloseDate = acctCloseDate;
    }
    
    public float deposit(float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be less than ZERO");
        }
        System.out.println("deposit " + amount + " at " + currentDate());
        balance += amount;
        return balance;
    }

    public void withdraw(float amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be less than ZERO");
        }
        System.out.println("withdraw " + amount + " at " + currentDate());
        this.balance -= amount;
        

        StringBuffer txnlog = new StringBuffer("withdraw ");
        txnlog.append(amount);
        txnlog.append(" at ");
        txnlog.append(currentDate());
        transactions.add(txnlog.toString());

    }

    public String currentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
