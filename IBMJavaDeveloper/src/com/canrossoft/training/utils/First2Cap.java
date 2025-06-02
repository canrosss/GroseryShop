package com.canrossoft.training.utils;

public class First2Cap {
    String text = "Not valid";

    public String convert(String str){
        try{
            str = str.toLowerCase(); // Todo a minusculas
            return str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("No allowed empty strings!");
            return this.text;
        }
    }

    public static void main(String[] args){

        String text  = "stackoverflow";
        First2Cap f2c = new First2Cap();

        System.out.println(f2c.convert(text));
        System.out.println(f2c.convert(""));
    }
}