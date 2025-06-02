package com.canrossoft.training;
import java.util.Scanner;
//Task 3: Import and create a Scanner object
//Import and create a scanner object and create an object of scanner object to read from the console.

public class Task03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = s.nextLine();
        System.out.println("Hi! " + name);

    }
}
