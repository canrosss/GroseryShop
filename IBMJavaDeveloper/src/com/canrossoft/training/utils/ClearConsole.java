package com.canrossoft.training.utils;

public class ClearConsole {
    public void clear(){
        System.out.println("Clearing console using ProcessBuilder");
        String os = System.getProperty("os.name");
        try {
            if (os.startsWith("Windows")) {
                // Command for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Command for Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }

        } catch (Exception e) {
            System.out.println("Error while clearing console: " + e.getMessage());

        }
    }

    public static void main(String[] args) {
            ClearConsole c = new ClearConsole();
            c.clear();
    }
}