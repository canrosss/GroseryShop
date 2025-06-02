package com.canrossoft.training;

public class Item {
    String itemname;
    float itemprice;
    int itemamount;

    public void setItemName(String s) {
        this.itemname = s;
    }

    public void setAmount(int amount) {
        this.itemamount = amount;
    }

    public void setPrice(float price) {
        this.itemprice = price;
    }

    public Item(String n, float p, int c) {
       setItemName(n);
       setAmount(c);
       setPrice(p);
    }

    @Override
    public String toString(){
        return (" [+] " + this.itemname + " $" + this.itemprice + " per " + this.itemamount + " unit");
    }

    public static void main(String[] args){
        Item i = new Item("Coke", 12.50f, 99);
        System.out.println(i.toString());
    }
}
