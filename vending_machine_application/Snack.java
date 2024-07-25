package com.vending_machine_application;

public class Snack extends Product{
    private boolean isVegan;


    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
    public boolean getVegan(){
        return isVegan;
    }

    public Snack(String name, double price, boolean isVegan ){
        super(name,price);
        this.isVegan = isVegan;

    }

    @Override
    public String toString(){


        return super.toString() + ", isVegan =" + isVegan;
    }

}
