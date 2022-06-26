package com.vttp;

public class App 
{
    public static void main( String[] args )
    {
        BankAccount hongyew = new BankAccount("Hong Yew", 23355);
        hongyew.withdraw(1000);
        hongyew.withdraw(233);
        System.out.println(hongyew.getBalance());
        System.out.println(hongyew.getTransactions());

        
    }
}
