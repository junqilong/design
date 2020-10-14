package com.hll.design._12Builder;

/**
 * @author linglong.he
 * @date 2020-09-03 10:43
 **/
public class MyBuilder {

    public static void main(String[] args) {
        ShoppingObject shoppingObject =  new ShoppingObject.ShoppingObjectBuilder("苹果",2).buildAddress("jxs.lhx,lfz").build();
        System.out.println(shoppingObject.getAddress());
    }
}


class ShoppingObject {

    private String name;
    private int amount;
    private String address;
    private double price;


    private ShoppingObject(){

    }

    public static class ShoppingObjectBuilder{
        ShoppingObject shoppingObject = new ShoppingObject();
        public ShoppingObjectBuilder(String name,int amount){
            shoppingObject.name = name;
            shoppingObject.amount = amount;
        }

        public ShoppingObjectBuilder buildAddress(String address){
            shoppingObject.address = address;
            return this;
        }

        public ShoppingObjectBuilder buildPrice(double price){
            shoppingObject.price = price;
            return this;
        }

        public ShoppingObject build(){
            return shoppingObject;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}





