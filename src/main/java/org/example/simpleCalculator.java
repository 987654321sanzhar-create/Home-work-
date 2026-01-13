package org.example;

public class simpleCalculator {
    int namber1;
    int namber2;
    public void printNumbers(){
        System.out.println("number1 "+namber1+" namber2 "+namber2);
    }public void sum(){
        System.out.println(namber1+" + "+namber2+" = "+(namber1+namber2));
    }public void difference(){
        int result = namber1 - namber2;
        System.out.println(namber1+" - "+namber2+" = "+result);
    }
}
