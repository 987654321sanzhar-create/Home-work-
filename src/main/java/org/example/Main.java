package org.example;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
simpleCalculator user = new simpleCalculator();
user.namber1 = 20;
user.namber2 = 15;

        simpleCalculator user1 = new simpleCalculator();
        user1.namber1 = 20;
        user1.namber2 = 15;

        simpleCalculator user2 = new simpleCalculator();
        user2.namber1 = 20;
        user2.namber2 = 15;
user.printNumbers();
        user1.sum();
        user2.difference();

    }
}