package org.example;
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        BankAccount bank = new BankAccount("dddd",300);
        System.out.println(bank.withdraw(250));
        System.out.println(bank.getBalance());
    }
}