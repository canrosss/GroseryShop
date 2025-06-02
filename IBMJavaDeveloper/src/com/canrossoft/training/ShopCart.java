package com.canrossoft.training;
import java.util.ArrayList;

public class ShopCart {
    //Tiene una lista de items que se ponen en el carrito
    float discount;
    float grantTotal;
    float averagePrice;
    ArrayList<Item> items;


    public ShopCart()
    {
        items = new ArrayList<Item>(); // Create an ArrayList object
    }

    public void addItem(Item item){
        items.add(item);
    }

    public float avg(){
        int total = items.size();
        if(items.isEmpty()){
            return averagePrice = 0.0f;
        }else {
            for(Item items: items){
                this.averagePrice = (grantTotal / total);
            }
        }
        return grantTotal;
    }
    public float total(){
        if(items.isEmpty()){
            return grantTotal = 0.0f;
        }else {
            for(Item items: items){
                if(items.itemamount > 3) { this.discount = items.itemprice * 1.30f; }
                grantTotal = grantTotal + (items.itemprice * items.itemamount) - discount;
            }
        }
       return grantTotal;
    }

    public void showItems(){
        if(items.isEmpty()){
            System.out.println("The shopping cart is empty!");
        }else {
            System.out.println("Total Items [" + items.size() + "] currently on the cart:");
            for(Item items: items){
                System.out.println(" - "+ items);
            }
            System.out.println("-------------");
            System.out.println("GrandTotal: "+total());
            System.out.println("Discount: " + discount);
            System.out.println("Average   : "+ avg());
        }
    }

    public static void main(String[] args){
        ShopCart sc = new ShopCart();

        Item i = new Item("Coke", 12.50f, 2);
        Item p = new Item("Pizza", 19.90f, 1);

        sc.addItem(i);
        sc.showItems();
    }

}
