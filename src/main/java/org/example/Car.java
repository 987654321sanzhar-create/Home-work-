package org.example;

public class Car {
    private int speed;
    private boolean engineOn;

    public  Car (){
     speed = 0;
     engineOn = false;
    }

    public void startEngine(){
        engineOn = true;
        System.out.println("Двигатель включен");
    }

    public  void stopEngine(){
        engineOn = false;
        speed = 0;
        System.out.println("двигатель выключен");
    }

    public void accelerate(int value){
        if (!engineOn){
            System.out.println("нельзя разгоняться двигатель выключен");
            return;
        }
        if (value <= 0){
            System.out.println("скорость не может быть отрицательным");
        }else {
            speed+= value;
            System.out.println("ваша скорость увеличелась на "+value);
        }
    }
    public int getSpeed(){
        return speed;
    }
}
