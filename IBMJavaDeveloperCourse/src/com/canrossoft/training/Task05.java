package com.canrossoft.training;

//Task 5: Create for inner infinite loop for purchases
//Create an infinite loop that runs as long as the user wants to add items. The loop should exit when the user inputs Complete (ignoring the case).

import java.util.ArrayList;
import java.util.Scanner;

public class Task05 {
    static void showList(ArrayList<String> itemList, float[] itemPrice){
        for(int i = 0; i < itemList.size(); i++){
            System.out.println("Item: " + itemList.get(i) + " ... $"+itemPrice[i]);
        }
    }
    public static void main(String[] args){
       ArrayList<String> itemList = new ArrayList<>();
       String[] productsList = {"Galletas", "Cereal", "Cocacola", "Manazana", "Cereza", "Miel", "Café", "Té", "Queso", "Salmon"};
       float[] productPrice = {1.0f,99.40f,5.4f,3.3f,2.50f,4.5f,6.9f,9.9f,4.9f,99.9f};
       String item;
       String magicWord = "Complete";

       Scanner s = new Scanner(System.in);

       showList(itemList,productPrice);

       System.out.println("Cart: " + itemList.size() + " items");
       System.out.println("Inventory Management System v0.1");
       do {
           System.out.println("Item to add: ");
           item = s.nextLine();
           itemList.add(item);
       }while(!item.equalsIgnoreCase(magicWord));

        itemList.remove(magicWord); //Esto remueve la magic word de la lista para no mostrarla ;)

       System.out.println("-------------------");
       System.out.println("Tu lista es:");
       for(int i = 0; i < itemList.size();i++){
           System.out.println(itemList.get(i));
       }
       System.out.println("-------------------");
    }
}
