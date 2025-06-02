package com.canrossoft.training;
//Task 1: String array of items
//Create a String array of items you will buy from a grocery shop. It should be a minimum of 10, but not more than 25.

//Task 2: float array of unit price
//Create a float array of unit price for items, which corresponds to the index positions in the items array. The float array should be the same length as the items array.

public class Task01 {
    public static void main(String[] args) {
//        String[] itemList = new String[9];
        String[] itemList = {"Galletas", "Cereal", "Cocacola", "Manazana", "Cereza", "Miel", "Café", "Té", "Queso", "Salmon"};
        float[] itemPrice = {1.0f,99.40f,5.4f,3.3f,2.50f,4.5f,6.9f,9.9f,4.9f,99.9f};

        for(int i = 0; i < itemList.length; i++){
            System.out.println("Item: " + itemList[i] + " ... $"+itemPrice[i]);
        }

        System.out.println("Total Items: " + itemList.length);
    }
}