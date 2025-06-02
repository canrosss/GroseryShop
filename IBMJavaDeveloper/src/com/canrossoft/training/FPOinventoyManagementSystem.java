package com.canrossoft.training;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.canrossoft.training.utils.*;
import com.canrossoft.training.Item;
import com.canrossoft.training.utils.First2Cap;
import com.canrossoft.training.utils.ClearConsole;

public class FPOinventoyManagementSystem {
    //Crear una lista de items de 10 elementos hasta 25 máximo.
    char space = '\n';

    String[] itemList = {"Galletas",
            "Cereal",
            "Cocacola",
            "Manazana",
            "Cereza",
            "Miel",
            "Café",
            "Té",
            "Queso",
            "Salmon"};
    float[] itemPrice = {1.0f, 99.40f, 5.4f, 3.3f, 2.50f, 4.5f, 6.9f, 9.9f, 4.9f, 99.9f};

    private byte captureAmount() {
        Scanner s = new Scanner(System.in);

        byte amount = 0;
        try {
            amount = s.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Please gve me a valid number - How many?");
            captureAmount();
        }
        return amount;
    }

    private void errorMsg(){
        System.out.println(" --------------------------------------------------------------------------------");
        System.out.println(">> Not found! or not a valid item has been selected - please select another one from the list <<");
        System.out.println(" --------------------------------------------------------------------------------");
    }

    private void showOptions() {
        System.out.println("Welcome to Personal shopper!");
        System.out.println("---------------------------");
        System.out.println("Options:");
        System.out.println("1) Show the list");
        System.out.println("2) Select an item from the list");
        System.out.println("---------------------------");
    }

    private void showItems() {
        for (int i = 0; i < itemList.length; i++) {
            System.out.println(itemList[i] + " ... $" + itemPrice[i]);
        }
    }


    public static void main(String[] args) {
        First2Cap cap = new First2Cap();
        ClearConsole console = new ClearConsole();
        FPOinventoyManagementSystem FPO = new FPOinventoyManagementSystem();
        ShopCart cart = new ShopCart();
        byte amount = 0;

        Boolean complete = false;
        Boolean selected = false;

        console.clear();
        FPO.showItems();

        do {
            Scanner s = new Scanner(System.in);
            System.out.println(FPO.space);
            System.out.print("Item?: ");
            String i = s.nextLine();
            if (i.equals("end")){ break; }

            i = cap.convert(i);
            System.out.println("Your selected item is: " + "[ " + i + " ]" );

            for(int index = 0; index < FPO.itemList.length; index++){
                if(FPO.itemList[index].equals(i)){
                    System.out.println("Checking in my inventory you said " + FPO.itemList[index] + " we have " + i + ":)");
                    System.out.print(FPO.space);
                    System.out.println("So the item is found!");
                    System.out.println("The price: is $" + FPO.itemPrice[index]);
                    System.out.println("How many?");
                    amount = FPO.captureAmount();
                    Item item = new Item(FPO.itemList[index],FPO.itemPrice[index],amount);
                    System.out.println("Your item selected is: " + item.toString());
                    System.out.print("Moving to the shopping cart?");
                    System.out.print("Write [  end  ] to complete your shopping");
                    cart.addItem(item);
                    break;
                }
                else {
                    FPO.errorMsg();
                    FPO.showItems();
                    continue;
                }
            }
        } while(!complete);

        cart.showItems();

    }
}
