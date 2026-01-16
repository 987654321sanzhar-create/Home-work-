package org.example;

public class BankAccount {
    private String onwer;
    private double balance;

    public BankAccount(String onwer, double balance) {
        this.onwer = onwer;
        this.balance = balance;
    }

    public BankAccount(){}

    public void deposit(double amound){
        if (amound > 0){
            balance+= amound;
            System.out.println("Ваш баланс пополнен на сумму "+amound);
        }else {
            System.out.println("Не достаточно баланса");
        }
    }

    public Double withdraw(double amound){
        if (balance >= amound){
            balance-= amound;
            System.out.println("Вы сняли сумму на "+amound);
            System.out.println("Ваш баданс "+balance);
        }else {
            System.out.println("У вас недостаточно средств");
        }
        return balance;
    }

    public double getBalance(){
        if (balance >= 0) {
            this.balance = balance;
        }else {
            this.balance = 0;
        }
     return balance;
    }
}
