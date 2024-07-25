package com.vending_machine_application;

public class VendRunner {
    public static void main(String[] args) {

        Snack snack1 = new Snack("Doritos", 2.22, true);
        Snack snack2 = new Snack("Choclate", 3.22, false);


// Beverage object

        Beverage beverage1 = new Beverage("Applejuce", 4.33, 20.2);
        Beverage beverage2 = new Beverage("Pepsi", 4.33, 20.2);


// Slot object
        Slot slot1 = new Slot(snack1, 10);
        Slot slot2 = new Slot(snack2, 6);
        Slot slot3= new Slot(beverage1, 12);
        Slot slot4 = new Slot(beverage2, 3);

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addProduct("A122",slot1);
        vendingMachine.addProduct("A123",slot2);
        vendingMachine.addProduct("A1234",slot3);
        vendingMachine.addProduct("A12345",slot4);

        System.out.println("Before: ");
        vendingMachine.displayProducts();


        System.out.println(vendingMachine.dispenseProduct("A122"));
        System.out.println(vendingMachine.dispenseProduct("A123"));

        System.out.println("After: ");
        vendingMachine.displayProducts();

    }

}