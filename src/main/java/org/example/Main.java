package org.example;
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
   Car car = new Car();
   car.stopEngine();
   car.accelerate(500);
        System.out.println(car.getSpeed());
    }
}